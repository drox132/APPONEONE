package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.Student;
import com.fran.AppOneOne.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
public class StudentController {

    private final StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    @GetMapping("7selectallstudent")
    public List<Student> selectAllStudent(){
        return studentService.selectAllStudent();
    }
    @GetMapping("/selectallstudentby/{id}")
    public Student selectAllStudentById(@PathVariable int id){
        return studentService.selectStudentById(id);
    }
    @PostMapping("/insertstudent")
    public void insertStudent(@RequestBody Student nuevoStudent){
        studentService.insertStudent(nuevoStudent);
    }
    @PutMapping("/updatestudent")
    public void updateStudentById(@RequestBody Student updateStudent){
        studentService.updateStudentById(updateStudent);
    }
    @DeleteMapping("/deletestudentby/{id}")
    public void deleteStudentById(@PathVariable int id){
        studentService.deleteStudentById(id);
    }
}
