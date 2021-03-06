package com.testjavaspringbootgradle.testjavaspringbootgradle;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.dto.DataEmployeesRequest;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Address;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Employees;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.entity.Position;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Addressrepository;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Employeesrepository;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.repository.Positionrepository;
import com.testjavaspringbootgradle.testjavaspringbootgradle.extendstestfuntion.service.EmployeesService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class GetdataController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Getdata greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Getdata(counter.incrementAndGet(), String.format(template, name));
    }

    @Autowired
    EmployeesService employeesservice;

    @Autowired
    Employeesrepository employeesrepository;
    
    @Autowired
    Addressrepository addressrepository;
    
    @Autowired
    Positionrepository positionrepository;

    @GetMapping("/Employees")
    public List<Employees> findAllEmployees() {
        return (List<Employees>)employeesrepository.findAll();
    }

    @GetMapping("/Employees/{id}")
    private Optional<Employees> getEmployees(@PathVariable("id") Long id) 
    {  
        return employeesrepository.findById(id);
    }

    @PostMapping("/Employees")
    public Employees saveDataorUpdate(@RequestBody Employees employees)   
    {   
        List<Address> addresses = employees.getAddress();
        // addresses = addressrepository.saveAll(addresses);
        
        List<Position> positiones = employees.getPosition();
        // positiones = positionrepository.save(positiones);

        employees = employeesrepository.save(employees);
        employees.setAddress(addresses);
        employees.setPosition(positiones);
        employeesrepository.save(employees);
        System.out.println("eeeee:"+ employees);
        return employees;
    }

    @DeleteMapping("/Employeesdelete")  
    private void deleteEmployees(@RequestBody DataEmployeesRequest request)   
    {  
       employeesrepository.delete(request.getEmployees());  
    }  

}