package com.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.entity.*;
import com.service.*;


import java.util.List;

@RestController
@RequestMapping("/api/students")
@CrossOrigin("*")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private UserService userService;

    // Get all students
    @GetMapping("/all")
    public List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    // Add student + save credentials into USERS table
    @PostMapping("/add")//http://localhost:8080/api/students/add
    public Student addStudent(@RequestBody Student student) {

     //   Student savedStudent = studentService.addStudent(student);

        User user = new User();
        user.setUsername(student.getUsername());
        user.setPassword(student.getPassword());
        //user.setId((long)100);
        user.setRole("STUDENT");
      //  user.setActive(1);
        userService.add(user);

        return studentService.addStudent(student);

    }  
    
    
    
    
}






























