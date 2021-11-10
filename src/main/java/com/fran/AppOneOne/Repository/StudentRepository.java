package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

    @Query(value = "SELECT * FROM student", nativeQuery = true)
    List<Student> sellectAllStudent ();

    @Query(value = "SELECT * FROM student WHERE id= :iduser", nativeQuery = true)
    Student selectStudentById (@Param("iduser") int id);

    @Query(value = "INSERT INTO Student (name , age ) values ( :nameuser , :ageuser ) " ,nativeQuery = true )
    void insertStudent (@Param("nameuser") String name, @Param("ageuser") int age);

    @Query(value = "UPDATE student SET name = :nameuser , age= :ageuser WHERE id= :iduser" , nativeQuery = true)
    void updateStudentById (@Param("nameuser") String name, @Param("ageuser") int age, @Param("iduser") int id);

    @Query(value = "SELECT * FROM student", nativeQuery = true)
    void deleteStudentByid (int id);







}

