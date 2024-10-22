//package com.example.springcrudope.restapi.controller;
//
//import com.example.springcrudope.restapi.entity.Employee;
//import com.example.springcrudope.restapi.repository.EmployeeRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//public class EmployeeController {
//    @Autowired
//    EmployeeRepository emprep;
//
//    @PostMapping("/employee/add")
//    @ResponseStatus(code = HttpStatus.CREATED)
//    public void createEmployee(@RequestBody Employee employee){
//        emprep.save(employee);
//    }
//
//    @GetMapping("/employee/getemp")
//    public List<Employee> getEmployees(){
//        return emprep.findAllByQuery();
//    }
//
//    @GetMapping("/employee/get/name/{name}")
//    public List<Employee> getEmployeesByName(@PathVariable String name){
//        return emprep.findAllByName(name);
//    }
//
//    @PutMapping("/employee/update/name/id/{name}/{id}")
//    public int updateEmployee(@PathVariable String name,
//                               @PathVariable int id){
//
//        return emprep.updateNameById(name,id);
//    }
//}
