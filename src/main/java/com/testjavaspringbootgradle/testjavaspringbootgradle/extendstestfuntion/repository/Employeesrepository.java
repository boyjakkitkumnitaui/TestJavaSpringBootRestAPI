package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository;

import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Employees;

import org.springframework.data.jpa.repository.JpaRepository;

// import org.springframework.data.repository.CrudRepository;

// public interface Employeesrepository extends CrudRepository<Employees ,Long> {
    
// }

public interface Employeesrepository extends JpaRepository<Employees ,Long> {
    
}