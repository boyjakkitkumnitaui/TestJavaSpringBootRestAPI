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
public class Position {
    @Id
    @GeneratedValue
    private Long idposition;
    private String nameposition;
    

    public Long getid(){
        return idposition;
    }
}
