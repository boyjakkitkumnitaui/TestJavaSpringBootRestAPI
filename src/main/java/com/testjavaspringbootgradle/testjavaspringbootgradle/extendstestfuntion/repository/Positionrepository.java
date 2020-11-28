package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository;

import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Position;

import org.springframework.data.repository.CrudRepository;

public interface Positionrepository extends CrudRepository<Position ,Long>{
}
