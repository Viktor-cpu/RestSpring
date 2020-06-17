package com.example.usersBase;

import com.example.usersBase.repository.RepoUsers;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class UsersBaseApplication {

	public static void main(String[] args) {
		ApplicationContext context =  SpringApplication.run(UsersBaseApplication.class, args);

		RepoUsers repoUsers = context.getBean(RepoUsers.class);

//		repoUsers.save(new User("1","1","1","1","1","1","1","1",new BigDecimal(123)));
		repoUsers.findAll().forEach(x-> System.out.println(x));

	}

}
