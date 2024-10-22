//package com.example.springcrudope.restapi.controller;
//
//import com.example.springcrudope.restapi.entity.Employee;
//import com.example.springcrudope.restapi.entity.Student;
//import com.example.springcrudope.restapi.repository.EmployeeRepository;
//import com.example.springcrudope.restapi.repository.StudentRepository;
//import jakarta.persistence.NamedQuery;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//public class StudentController {
//
//    @Autowired
//    StudentRepository rep;
//
//    @Autowired
//    EmployeeRepository emprep;
//
//    @GetMapping("/employee")
//    List<Employee> getEmployees(){
//        return emprep.findAll();
//    }
//    @GetMapping("/employee/name/{name}")
//    List<Employee> getEmployeesByName(String name){
//        return emprep.findAllByName(name);
//    }
//
//    @PostMapping("/employee/addData")
//    @ResponseStatus(code =HttpStatus.CREATED )
//    public void putData(@RequestBody Employee emp){
//        emprep.save(emp);
//    }
//
//
//
//
//    @GetMapping("/students")
//    public List<Student> getAllStudents(){
//        List<Student> stu=rep.findAll();
//        return stu;
//    }
//    //crud-modeified
//    @GetMapping("/students/name/{name}")
//    public List<Student> getByName(@PathVariable String name){
//        List<Student> st=rep.findByName(name);
//        return st;
//    }
//
//    //crud-modeified
//    @GetMapping("/students/branch/{branch}")
//    public List<Student> getByBranch(@PathVariable String branch){
//        List<Student> st=rep.findByBranch(branch);
//        return st;
//    }
//
//    //crud-modeified
//    @GetMapping("/students/percentage/{percentage}")
//    public List<Student> getByPercentage(@PathVariable double percentage){
//        List<Student> st=rep.findByPercentage(percentage);
//        return st;
//    }
//
//    @GetMapping("/students/id/{id}")
//    public Student getStudent(@PathVariable int id){
//        Student st=rep.findById(id).get();
//        return st;
//    }
//
//    @PostMapping("/students/create")
//    @ResponseStatus(code = HttpStatus.CREATED)
//    public void createStudent(@RequestBody Student student){
//
//        rep.save(student);
//    }
//
//    @PutMapping("/students/update/id/{id}")
//    public Student updateStudents(@PathVariable int id){
//        Student su=rep.findById(id).get();
//        su.setName("Mahi");
//        su.setPercentage(44.9);
//        rep.save(su);
//        return su;
//    }
//
//    //crud-modeified
//    @PutMapping("/students/update/name/{name}")
//    public Student updateStudentsByName(@PathVariable String name){
//        List<Student> students= rep.findByName(name);
//        Student s=students.get(0);
////        if(!students.isEmpty()){
//            s.setName("murali");
//            rep.save(s);
////        }
//        return s;
//    }
//
//    //crud-modeified
//    @PutMapping("/students/update/branch/{branch}")
//    public Student updateStudentsByBranch(@PathVariable String branch){
//        List<Student> students=rep.findByBranch(branch);
//        Student s=students.get(0);
//        s.setBranch("Medical");
//        rep.save(s);
//        return s;
//    }
//
//    //crud-modeified
//    @PutMapping("/students/update/percentage/{percentage}")
//    public Student updateStudentsByPercentage(@PathVariable double percentage){
//        List<Student> students=rep.findByPercentage(percentage);
//        Student s=students.get(0);
//        s.setPercentage(98.7);
//        rep.save(s);
//        return s;
//    }
//
//    @DeleteMapping("/students/delete/id/{id}")
//    public void deleteStudent(@PathVariable int id)
//    {
//        Student st=rep.findById(id).get();
//        rep.delete(st);
//    }
//
//    //crud-modeified
//    @DeleteMapping("/students/delete/name/{name}")
//    public void deleteStudentByName(@PathVariable String name){
//        Student st=rep.findByName(name).get(0);
//        rep.delete(st);
//    }
//
//    //crud-modeified
//    @DeleteMapping("/students/delete/branch/{branch}")
//    public void deleteStudentsByBranch(@PathVariable String branch){
//        Student st=rep.findByBranch(branch).get(0);
//        rep.delete(st);
//    }
//
//    //crud-modeified
//    @DeleteMapping("/students/delete/percentage/{percentage}")
//    public void deleteStudentsByPercentage(@PathVariable double percentage){
//        Student st=rep.findByPercentage(percentage).get(0);
//        rep.delete(st);
//    }
//
//    //NAmed Query
//    @GetMapping("/students/getnamequery/id/{id}")
//    public List<Student> getStudentsByNamedQuery(@PathVariable int id){
//        return rep.getStudentByNamed(id);
//    }
//
//    @GetMapping("/students/getnamed/name/{name}")
//    public List<Student> getStudentsByNameNamedQuery(@PathVariable String name){
//        return rep.getStudentByName(name);
//    }
//
//    //NamedQuery
//    @PutMapping("/students/update/named/{name}")
//    public Student updateByNamed(@PathVariable String name){
//        List<Student> students= rep.updateStudentByName(name);
//        Student s=students.get(0);
//        rep.save(s);
//        return s;
//    }
//
//}
