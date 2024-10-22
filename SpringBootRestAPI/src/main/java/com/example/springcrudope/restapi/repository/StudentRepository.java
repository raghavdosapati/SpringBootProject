//package com.example.springcrudope.restapi.repository;
//
//import com.example.springcrudope.restapi.entity.Student;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//
//import java.util.List;
//
//public interface StudentRepository extends JpaRepository<Student,Integer>
//{
//    public List<Student> findByName(String name);
//
//    public List<Student> findByBranch(String branch);
//    public List<Student> findByPercentage(double percentage);
//
//    // NamedQueries
//    @Query(name = "findStudentById")
//    List<Student> getStudentByNamed(int id);
//
//    @Query(name = "getStudentByName")
//    List<Student> getStudentByName(String name);
//
//    @Query(name = "updateStudentByName")
//    List<Student> updateStudentByName(String name);
//}
