package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.dto;

import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Employees;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class DataEmployeesRequest {
    private Employees employees;
}
