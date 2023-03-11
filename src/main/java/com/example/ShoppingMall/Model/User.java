package com.example.ShoppingMall.Model;

import lombok.*;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.Date;

@Setter
@Getter
@NoArgsConstructor
@ToString
@AllArgsConstructor
@Entity
@Table(name="users")
public class User
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int Id;
    @Column(name="userName")
    private String Name;
    @Column(name="userEmail")
    private String email;
    @Column(name="userPassword")
    private String Password;
    private BigInteger phoneNumber;
    private String Address;
    @Column(name="userAge")
    private int Age;
    @Temporal(TemporalType.DATE)
    @Column(name="DateOfBirth")
    private Date DOB;
//    @Enumerated(EnumType.STRING)
//    private UserGender Gender;
//    @Enumerated(EnumType.STRING)
//    private UserStatus Status;
//    @Enumerated(EnumType.STRING)
//    private UserRoles Roles;
//    @Temporal(TemporalType.TIMESTAMP)
    private Date LoginDate;
    @Temporal(TemporalType.TIMESTAMP)
    private Date CreatedDate;

}
