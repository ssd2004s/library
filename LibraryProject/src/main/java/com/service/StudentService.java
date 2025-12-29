//package com.service;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.entity.Student;
//import com.repository.StudentRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentService 
//{
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    public Optional<Student> getStudentById(Long id) {
//        return studentRepository.findById(id);
//    }
//    
////    public Student addStudent(Student student)
////    {
////    	student.setStudentId(null);
////    	return studentRepository.save(student);
////    }
//    
//    
//    public Student addStudent(Student student) {
//        return studentRepository.save(student);
//    }
//
//    
//    
// // Update existing student
//    public Student updateStudent(Long id, Student updatedStudent) {
//        return studentRepository.findById(id).map(student -> {
//            student.setName(updatedStudent.getName());
//            student.setRollNo(updatedStudent.getRollNo());
//            student.setEmail(updatedStudent.getEmail());
//            student.setMobileNumber(updatedStudent.getMobileNumber());
//            student.setDepartment(updatedStudent.getDepartment());
//            student.setUsername(updatedStudent.getUsername());
//           student.setPassword(updatedStudent.getPassword());
//            return studentRepository.save(student);
//        }).orElse(null); // Return null if student not found
//    }
//
//    
// 
//}
//


//
//
//
//package com.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.entity.Student;
//import com.repository.StudentRepository;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class StudentService {
//
//    @Autowired
//    private StudentRepository studentRepository;
//
//    public List<Student> getAllStudents() {
//        return studentRepository.findAll();
//    }
//
//    public Optional<Student> getStudentById(Long id) {
//        return studentRepository.findById(id);
//    }
//
//    public Student addStudent(Student student) {
//        return studentRepository.save(student);
//    }
//
//    public Student updateStudent(Long id, Student student) {
//        if (!studentRepository.existsById(id)) return null;
//        student.setStudentId(id);
//        return studentRepository.save(student);
//    }
//}









package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.*;
import com.entity.*;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

//    public Optional<Student> getStudentById(Long id) {
//        return studentRepository.findById(id);
//    }

    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

//    public Student updateStudent(Long id, Student student) 
//    {
//        if (!studentRepository.existsById(id)) return null;
//        student.setStudentId(id);
//        return studentRepository.save(student);
//    }
    
    
    public Student updateStudent(Long id, Student updatedStudent) {

        return studentRepository.findById(id).map(student -> {

            student.setName(updatedStudent.getName());
            student.setRollNo(updatedStudent.getRollNo());
            student.setEmail(updatedStudent.getEmail());
            student.setMobileNumber(updatedStudent.getMobileNumber());
            student.setDepartment(updatedStudent.getDepartment());
            student.setUsername(updatedStudent.getUsername());
            student.setPassword(updatedStudent.getPassword());

            return studentRepository.save(student);

        }).orElse(null);
    }

    public Student getStudentById(Long studentId) {
        return studentRepository.findById(studentId)
                .orElseThrow(() -> new RuntimeException("Student not found with id: " + studentId));
    }

}



