package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository;

import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Address;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Addressrepository extends JpaRepository<Address ,Long> {
    
}
