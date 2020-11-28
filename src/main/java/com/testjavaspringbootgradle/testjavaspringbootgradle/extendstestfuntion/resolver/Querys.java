package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.resolver;

import java.util.List;

import javax.transaction.Transactional;

import com.coxautodev.graphql.tools.GraphQLQueryResolver;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Address;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Employees;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Addressrepository;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Employeesrepository;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Querys implements GraphQLQueryResolver{

    @Autowired
    private Employeesrepository employeesrepository;
    @Autowired
    private Addressrepository addressrepository;

    public Querys(Employeesrepository employeesrepository){
        this.employeesrepository = employeesrepository;
    }

    @Transactional
    public List<Employees> findAllEmployees(){
        List<Employees> lEmployees = (List<Employees>) employeesrepository.findAll();
        System.out.print("ddddd: " + lEmployees);
        lEmployees.forEach(lEmployee -> {
            Hibernate.initialize(lEmployee.getAddress());
        });
        return (List<Employees>) employeesrepository.findAll();
    }

    @Transactional
    public List<Address> findAllAddress(){
        return (List<Address>) addressrepository.findAll();
    }
}
