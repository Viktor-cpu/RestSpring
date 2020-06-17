package com.example.usersBase.repository;

import com.example.usersBase.entities.User;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RepoUsers extends PagingAndSortingRepository<User,Long> {
}
