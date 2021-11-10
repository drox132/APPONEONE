package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.Student;

import java.util.List;

public interface StudentService {

    List<Student> selectAllStudent();
    Student selectStudentById (int id);
    void insertStudent(Student nuevoStudent);
    void updateStudentById(Student updateStudent);
    void deleteStudentById(int id);
}
