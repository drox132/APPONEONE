package com.fran.AppOneOne.Controller;

import com.fran.AppOneOne.Model.Teacher;
import com.fran.AppOneOne.Service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/teacher")
public class TeacherController {

    private final TeacherService teacherService;

    @Autowired
    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @GetMapping("/teacher")
    public List<Teacher> selectAllTeacher() {
        return teacherService.selectAllTeacher();
    }
    @GetMapping("/selectteacherby/{id}")
    public Teacher selectTeacherById(@PathVariable int id) {
        return teacherService.selectTeacherById(id);
    }
    @PostMapping("/insertteacher")
    public void insertTeacher(@RequestBody Teacher nuevoTeacher) {
        teacherService.insertTeacher(nuevoTeacher);
    }
    @PutMapping("/updateteacherbyid")
    public void updateTeacherById(@RequestBody Teacher updateTeacher) {
        teacherService.updateTeacherById(updateTeacher);
    }
    @DeleteMapping("/delecteteacherby/{id}")
    public void deleteTeacherById(@PathVariable int id) {
        teacherService.deleteTeacherById(id);
    }
}