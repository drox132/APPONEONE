package com.fran.AppOneOne.Repository;

import com.fran.AppOneOne.Model.Person;
import com.fran.AppOneOne.Model.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TeacherRepository extends JpaRepository <Teacher,Integer>{

    @Query(value = "SELECT * FROM teacher", nativeQuery = true)
    List<Teacher> selectAllTeacher();

    @Query(value = "SELECT * FROM teacher", nativeQuery = true)
    Teacher selectTeacherById(int id);

    @Query(value = "SELECT * FROM teacher", nativeQuery = true)
    void insertTeacher(String name, String lastname);

    @Query(value = "SELECT * FROM teacher", nativeQuery = true)
    void updateTeacherById(String name, String lastname);

    @Query(value = "SELECT * FROM teacher", nativeQuery = true)
    void deleteTeacherById(int id);
}
