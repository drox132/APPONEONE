package com.fran.AppOneOne.Service;

import com.fran.AppOneOne.Model.Teacher;

import java.util.List;

public interface TeacherService {

    List<Teacher> selectAllTeacher();
    Teacher selectTeacherById (int id);
    void insertTeacher(Teacher nuevoTeacher);
    void updateTeacherById(Teacher updateTeacher);
    void deleteTeacherById(int id);
}
