package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.resolver;

import java.util.List;

import javax.transaction.Transactional;

import com.coxautodev.graphql.tools.GraphQLMutationResolver;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Address;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Employees;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Position;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Addressrepository;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Employeesrepository;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Positionrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;

import lombok.AllArgsConstructor;

@Component
@AllArgsConstructor
public class Mutation implements GraphQLMutationResolver {
    @Autowired
    private Positionrepository positionrepository;
    private Employeesrepository employeesrepository;
    private Addressrepository addressrepository;
    
    public Position createPosition(String nameposition) {
        Position position = new Position(null,nameposition);
        return positionrepository.save(position);
    }
    @Transactional
    public Employees createEmployees(Employees input) {
        // System.out.println("Test: "+ input);
        // System.out.println("Test: "+ input.getAddress());
        // System.out.println("Test: "+ input.getPosition());
        List<Address> addresses = input.getAddress();
        List<Position> positiones = input.getPosition();
        input.setAddress(addresses);
        input.setPosition(positiones);
        employeesrepository.save(input);
        return input;
    }
    
    @Transactional
    public Employees updateEmployees(Employees input) {
        // System.out.println("Test: "+ input);
        // System.out.println("Test: "+ input.getAddress());
        // System.out.println("Test: "+ input.getPosition());
        List<Address> addresses = input.getAddress();
        List<Position> positiones = input.getPosition();
        input.setAddress(addresses);
        input.setPosition(positiones);
        // System.out.println("Mdddddd: "+ input);
        employeesrepository.save(input);
        return input;
    }

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

    public Long deleteEmployees(Long id) {
        System.out.println("Delete: "+id);
        employeesrepository.deleteById(id);
        Long success;
        success = (long) 0;
        return success;
    }
    public Long deleteAddress(Long id) {
        System.out.println("Delete: "+id);
        addressrepository.deleteById(id);
        Long success;
        success = (long) 0;
        return success;
    }
    public class PositionNotFoundException extends RuntimeException {

        /**
         *
         */
        private static final long serialVersionUID = 1L;

    }
}
