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
    private Long id;
    private String nameposition;
    private String nameposition2;
    private String nameposition22;
}
