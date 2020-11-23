package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
public class Employees {
    
    @Id
    @GeneratedValue
    private Long id;
    private String namethai;
    private String lastnamethai;
    private String nameeng;
    private String lastnameeng;
    private String idcardnumber;

    @OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ep_fk",referencedColumnName = "id")
    private List<Address> address;

    @OneToMany(targetEntity = Position.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ep_fk_posi",referencedColumnName = "id")
    private List<Position> position;
}