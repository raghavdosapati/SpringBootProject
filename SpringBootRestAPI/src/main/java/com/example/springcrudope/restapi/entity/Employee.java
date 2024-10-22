//package com.example.springcrudope.restapi.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name="Employee")
//public class Employee {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @Column(name = "EmpName")
//    private String name;
//    @Column(name = "EmpDesignation")
//    private String designation;
//
//    public Employee(){
//
//    }
//
//    public Employee(int id, String designation, String name) {
//        this.id = id;
//        this.designation = designation;
//        this.name = name;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getDesignation() {
//        return designation;
//    }
//
//    public void setDesignation(String designation) {
//        this.designation = designation;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "designation='" + designation + '\'' +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                '}';
//    }
//}
