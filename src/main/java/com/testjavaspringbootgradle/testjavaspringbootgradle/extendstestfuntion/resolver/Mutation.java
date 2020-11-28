package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.resolver;

import javax.transaction.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Employees;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Position;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Position.UpdateProfileInput;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Employeesrepository;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Positionrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private Positionrepository positionrepository;
    private Employeesrepository employeesrepository;
    
    public Position createPosition(String nameposition) {
        Position position = new Position(null,nameposition);
        return positionrepository.save(position);
    }

    // public Employees createEmployees(String namethai,String lastnamethai,String nameeng,String lastnameeng,String idcardnumber) {
    //     Employees employees = new Employees(null, namethai, lastnamethai, nameeng, lastnameeng, idcardnumber, null,null);
    //     employeesrepository.save(employees);
    //     return employees;
    // }
    
    public Position updatePosition(Position input) {
        Position position = positionrepository.findById(input.getId()).orElseThrow(PositionNotFoundException::new);
        position.setNameposition(input.getNameposition());
        return positionrepository.save(position);
    }

    public Long deletePosition(Long id) {
        System.out.println("Delete: "+id);
        positionrepository.deleteById(id);
        Long success;
        success = (long) 0;
        return success;
    }

    public class PositionNotFoundException extends RuntimeException {

    }
}
