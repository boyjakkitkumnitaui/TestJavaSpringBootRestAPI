package com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.service;

import javax.transaction.Transactional;

import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Employees;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Employeesrepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeesService {
    @Autowired
    Employeesrepository employeesrepository;
    public void createEmployees(Employees employees){
        employeesrepository.save(employees); 
    }

    @Transactional
    public Employees createEmployees(String namethai, String lastnamethai, String nameeng, String lastnameeng, String idcardnumber) {
        Employees employees = new Employees(null, namethai, lastnamethai, nameeng, lastnameeng, idcardnumber, null,
                null);
       return employeesrepository.save(employees);
    }
    // //getting all student records  
    // public List<Employees> getAllEmployees()   
    // {  
    // List<Employees> employeess = new ArrayList<Employees>();  
    //     employeesrepository.findAll().forEach(employees -> employeess.add(employees));  
    //     return employeess;  
    // }  
    // //getting a specific record  
    // public Employees getEmployeesById(Long id)   
    // { 
    //     return employeesrepository.findById(id).get();  
    // }

    // public void saveOrUpdateEmployees(Employees employees)   
    // {  
    //     employeesrepository.save(employees);  
    // }  
}
