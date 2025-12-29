//package com.Controller;
//
//import com.repository.BookRepository;
//import com.repository.StudentRepository;
//import com.repository.IssueBookRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.HashMap;
//import java.util.Map;
//
//@RestController
//@RequestMapping("/api/dashboard")
//@CrossOrigin("*")
//public class DashboardController {
//
//    @Autowired
//    private BookRepository bookRepository;
//
//    @Autowired
//    private StudentRepository studentRepository;
////
//    @Autowired
//    private IssueBookRepository issueBookRepository;
//
//    @GetMapping("/counts")
//    public Map<String, Long> getDashboardCounts() {
//        Map<String, Long> response = new HashMap<>();
//        long availableBooks = totalBooks - issuedBooks;
//
//        response.put("totalBooks", bookRepository.count());
//        response.put("issuedBooks", issueBookRepository.count());
//        response.put("totalStudents", studentRepository.count());
//        return response;
//    }
//    
//}




package com.Controller;

import com.repository.BookRepository;
import com.repository.StudentRepository;
import com.repository.IssueBookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/dashboard")
@CrossOrigin("*")
public class DashboardController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private IssueBookRepository issueBookRepository;

    @GetMapping("/counts")
    public Map<String, Long> getDashboardCounts() {

        long totalBooks = bookRepository.count();
        long issuedBooks = issueBookRepository.count();
        long totalStudents = studentRepository.count();

        // ⭐ Available Books Logic
        long availableBooks = totalBooks - issuedBooks;

        Map<String, Long> response = new HashMap<>();
        response.put("totalBooks", totalBooks);
        response.put("issuedBooks", issuedBooks);
        response.put("totalStudents", totalStudents);
        response.put("availableBooks", availableBooks);

        return response;
    }
}

