package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.Teacher;
import com.fran.AppOneOne.Repository.TeacherRepository;
import com.fran.AppOneOne.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImplementation implements TeacherService {

    private final TeacherRepository teacherRepository;

    @Autowired
    public TeacherServiceImplementation(TeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }


    @Override
    public List<Teacher> selectAllTeacher() {
        return teacherRepository.selectAllTeacher();
    }

    @Override
    public Teacher selectTeacherById(int id) {
        return teacherRepository.selectTeacherById(id);
    }

    @Override
    public void insertTeacher(Teacher nuevoTeacher) {
        teacherRepository.insertTeacher(nuevoTeacher.getName(),nuevoTeacher.getLastName());

    }

    @Override
    public void updateTeacherById(Teacher updateTeacher) {
        teacherRepository.updateTeacherById(updateTeacher.getName(),updateTeacher.getLastName());
    }

    @Override
    public void deleteTeacherById(int id) {
        teacherRepository.deleteTeacherById(id);
    }
}
