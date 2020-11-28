package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employees {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String namethai;
    private String lastnamethai;
    private String nameeng;
    private String lastnameeng;
    private String idcardnumber;

    @OneToMany
    private List<Address> address;

    @OneToMany
    private List<Position> position;
}