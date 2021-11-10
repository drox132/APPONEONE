package com.fran.AppOneOne.Service.Implementation;

import com.fran.AppOneOne.Model.Student;
import com.fran.AppOneOne.Repository.StudentRepository;
import com.fran.AppOneOne.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImplementation implements StudentService {

    private final StudentRepository studentRepository;

    @Autowired
    public StudentServiceImplementation(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> selectAllStudent() {
        return studentRepository.sellectAllStudent();
    }

    @Override
    public Student selectStudentById(int id) {
        return studentRepository.selectStudentById(id);
    }

    @Override
    public void insertStudent(Student nuevoStudent) {
        studentRepository.insertStudent(nuevoStudent.getName(),nuevoStudent.getAge());
    }

    @Override
    public void updateStudentById(Student updateStudent) {
        studentRepository.updateStudentById(updateStudent.getName(),updateStudent.getAge(),updateStudent.getId());
    }

    @Override
    public void deleteStudentById(int id) {
        studentRepository.deleteStudentByid(id);
    }
}
