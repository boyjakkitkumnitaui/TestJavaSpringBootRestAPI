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
    private Long idemployees;
    private String namethai;
    private String lastnamethai;
    private String nameeng;
    private String lastnameeng;
    private String idcardnumber;
    private Long idposition;

    @OneToMany(targetEntity = Address.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ep_fk",referencedColumnName = "idemployees")
    private List<Address> address;

    @OneToMany(targetEntity = Position.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "ep_fk_posi",referencedColumnName = "idemployees")
    private List<Position> position;

    public Long getid(){
        return idemployees;
    }

    public String namethai(){
        return namethai;
    }

    public String lastnamethai(){
        return lastnamethai;
    }

    public String nameeng(){
        return nameeng;
    }

    public String lastnameeng(){
        return lastnameeng;
    }

    public String idcardnumber(){
        return idcardnumber;
    }

    public Long idposition(){
        return idposition;
    }
}