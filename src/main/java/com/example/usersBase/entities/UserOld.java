//package com.example.usersBase.entities;
//
//import javax.persistence.*;
//import java.math.BigDecimal;
//
//
////@Data
////@NoArgsConstructor(access=AccessLevel.PRIVATE, force=true)
////@RequiredArgsConstructor
//@Entity
//@Table(name = "Users")
//public class UserOld {
//
//    public UserOld() {
//    }
//
////    public Ussser(String username, String password, String firstname, String secondname, String city, String street, String homenumber, String apartmentnumber, Integer moneybalance) {
////        this.username = username;
////        this.password = password;
////        this.firstname = firstname;
////        this.secondname = secondname;
////        this.city = city;
////        this.street = street;
////        this.homenumber = homenumber;
////        this.apartmentnumber = apartmentnumber;
//////        this.moneybalance = moneybalance;
////    }
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy=GenerationType.AUTO)
//    private Long id;
//
//    private String username;
//    private String password;
//    private String firstname;
//    private String secondname;
//    private String city;
//    private String street;
//    private String homenumber;
//    private String apartmentnumber;
//
//    private BigDecimal moneybalance;
//
//
//    public static long getSerialVersionUID() {
//        return serialVersionUID;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//
//    public String getFirstname() {
//        return firstname;
//    }
//
//    public void setFirstname(String firstname) {
//        this.firstname = firstname;
//    }
//
//    public String getSecondname() {
//        return secondname;
//    }
//
//    public void setSecondname(String secondname) {
//        this.secondname = secondname;
//    }
//
//    public String getCity() {
//        return city;
//    }
//
//    public void setCity(String city) {
//        this.city = city;
//    }
//
//    public String getStreet() {
//        return street;
//    }
//
//    public void setStreet(String street) {
//        this.street = street;
//    }
//
//    public String getHomenumber() {
//        return homenumber;
//    }
//
//    public void setHomenumber(String homenumber) {
//        this.homenumber = homenumber;
//    }
//
//    public String getApartmentnumber() {
//        return apartmentnumber;
//    }
//
//    public void setApartmentnumber(String apartmentnumber) {
//        this.apartmentnumber = apartmentnumber;
//    }
//
//    public BigDecimal getMoneybalance() {
//        return moneybalance;
//    }
//
//    public void setMoneybalance(BigDecimal moneybalance) {
//        this.moneybalance = moneybalance;
//    }
//
//    @Override
//    public String toString() {
//        return "User{" +
//                "id=" + id +
//                ", username='" + username + '\'' +
//                ", password='" + password + '\'' +
//                ", firstname='" + firstname + '\'' +
//                ", secondname='" + secondname + '\'' +
//                ", city='" + city + '\'' +
//                ", street='" + street + '\'' +
//                ", homenumber='" + homenumber + '\'' +
//                ", apartmentnumber='" + apartmentnumber + '\'' +
//                ", moneybalance=" + moneybalance +
//                '}';
//    }
//}
