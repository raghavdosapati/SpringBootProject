//package com.example.springcrudope.restapi.entity;
//
//import jakarta.persistence.*;
//
//import java.util.List;
//
////@NamedQuery(
////        name = "findStudentById",
////        query = "select s from Student s where s.id= :id"
////)
////@NamedQuery(
////        name = "getStudentByName",
////        query = "select s from Student s where s.name=:name"
////)
//@NamedQueries(
//        value = {
//                @NamedQuery(
//                        name = "findStudentById",
//                        query = "select s from Student s where s.id= :id"
//                ),
//                @NamedQuery(
//                        name = "getStudentByName",
//                        query = "select s from Student s where s.name=:name"
//                )
//        }
//)
//@Entity
//@Table(name="student")
//public class Student {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private int id;
//    @Column(name = "Student_name")
//    private String name;
//    @Column(name = "Student_percentage")
//    private double percentage;
//    @Column(name = "Student_branch")
//    private String branch;
//
////    @OneToOne(cascade = CascadeType.ALL)
////    @JoinColumn(name = "fkey")
////    private Employee employee;
//
//    @OneToMany(cascade = CascadeType.ALL)
//    @JoinColumn(name = "fkey",referencedColumnName = "empid")
//    private Employee employee;
//
//    public Student(){
//
//    }
//
//    public Student(String branch, String name, double percentage) {
//        super();
//        this.branch = branch;
//        this.name = name;
//        this.percentage = percentage;
//    }
//
//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }
//
//    public String getBranch() {
//        return branch;
//    }
//
//    public void setBranch(String branch) {
//        this.branch = branch;
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
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public double getPercentage() {
//        return percentage;
//    }
//
//    public void setPercentage(double percentage) {
//        this.percentage = percentage;
//    }
//
//    @Override
//    public String toString() {
//        return "Student{" +
//                "branch='" + branch + '\'' +
//                ", id=" + id +
//                ", name='" + name + '\'' +
//                ", percentage=" + percentage +
//                ", employee=" + employee +
//                '}';
//    }
//}
