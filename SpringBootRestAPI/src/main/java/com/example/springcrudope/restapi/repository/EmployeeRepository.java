//package com.example.springcrudope.restapi.repository;
//
//import com.example.springcrudope.restapi.entity.Employee;
//import jakarta.transaction.Transactional;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//
//import java.util.List;
//
//public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
//    //with no arguments
//    @Query("select e from Employee e")
//    List<Employee> findAllByQuery();
//
//    // param
//    @Query(" select e from Employee e where e.name= :name")
//    List<Employee> findAllByName(String name);
//
//    //update
//    @Modifying
//    @Transactional
//    @Query("update Employee e set e.name= :name where e.id= :id")
//    int updateNameById(@Param("name")String name,
//                                  @Param("id")int id);
//}
