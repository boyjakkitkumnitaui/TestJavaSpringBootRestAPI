package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository;

import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Position;

import org.springframework.data.jpa.repository.JpaRepository;

public interface Positionrepository extends JpaRepository<Position ,Long>{
    
}
