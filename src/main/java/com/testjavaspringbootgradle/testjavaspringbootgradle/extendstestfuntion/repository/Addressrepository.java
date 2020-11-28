package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository;

import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Address;

import org.springframework.data.repository.CrudRepository;

public interface Addressrepository extends CrudRepository<Address ,Long> {
    
}
