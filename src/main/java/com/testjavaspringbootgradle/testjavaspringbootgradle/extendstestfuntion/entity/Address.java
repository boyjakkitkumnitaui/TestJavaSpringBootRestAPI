package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Address {

    @Id
    @GeneratedValue
    private Long id;
    private String  addressno;
    private String  swine;
    private String  alleyway;
    private String  road;
    private String  subdistrict;
    private String  district;
    private String  province;
    private String  postal_code;
    private String  phone_number;
    private String  mobile_phone;
    private String  email;
}
