package com.example.ShoppingMall.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name="address")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Address
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String city;
    private String state;
    private int zipCode;
    private String streetAddress;

}
