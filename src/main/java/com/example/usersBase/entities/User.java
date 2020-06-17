package com.example.usersBase.entities;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;


@Entity
@Table(name = "Users")
@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
//@RequiredArgsConstructor
public class User extends BaseEntity {

    private String username;
    private String password;
    private String firstname;
    private String secondname;
    private String city;
    private String street;
    private String homenumber;
    private String apartmentnumber;

    private BigDecimal moneybalance;

}
