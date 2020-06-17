package com.example.usersBase.controllers;


import com.example.usersBase.entities.User;
import com.example.usersBase.repository.RepoUsers;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "users", produces = "application/json")
@Slf4j
public class MainController {

    /*
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * Вставил анотации @Data @NoArgsConstructorв в User
     * проверить авто-создание таблиц, т.е. удалить таблицу
     * !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
     * */

    private RepoUsers repoUsers;

    @Autowired
    public MainController(RepoUsers repoUsers) {
        this.repoUsers = repoUsers;
    }

    @GetMapping
    public ResponseEntity<List<User>> home() {
        log.info("Вызов @GetMapping");

        List<User> list = new ArrayList<>();
        repoUsers.findAll(Sort.by("id").ascending()).forEach(list::add);

        if (list.isEmpty()) {
            log.error("Пустая таблица Users");
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        log.info("Успешное получения данных (Users)");

        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @PostMapping(consumes = "application/json")
    public ResponseEntity<User> create(@RequestBody User user) {
        log.info("Вызов @PostMapping");

        /*
         * Не уверен, что нужна эта проверка и так ли её реализовывать?
         * Для моего клиента она точно бессполезна, т.к. юзер всегда улетает не "пустой", т.к. пустая строка это всё же строка.
         * Возможно нужены какие-то чеки для каждого поля и уже отталкиваться от них.
         * В Put она тоже есть.
         * */
        if (!Optional.ofNullable(user).isPresent()) {
            log.error("Ошибка создания. Пустой user.");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        repoUsers.save(user);

        log.info("Создание успешно. User: " + user);

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping(consumes = "application/json")
    public ResponseEntity<User> update(@RequestBody User user) {
        log.info("Вызов @PutMapping");

        if (!Optional.ofNullable(user).isPresent()) {
            log.error("Ошибка обновления. Пустой user");
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }

        repoUsers.save(user);

        log.info("Обновление успешно. User: " + user);

        return new ResponseEntity<>(user, HttpStatus.OK);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<User> delete(@PathVariable("id") Long id) {
        log.info("Вызов @DeleteMapping");

        try {
            repoUsers.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            log.error("Ошибка при удалении, id : " + id + " - HttpStatus.NO_CONTENT");
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }

        log.info("Удаление успешно. Id : " + id);

        return new ResponseEntity<>(HttpStatus.OK);
    }

}
