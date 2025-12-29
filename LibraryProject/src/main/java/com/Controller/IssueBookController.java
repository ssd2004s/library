package com.Controller;

import com.entity.IssueBook;
import com.service.IssueBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequestMapping("/issuebook")
public class IssueBookController {

    @Autowired
    private IssueBookService issueBookService;

    
    @PostMapping("/add")
    public IssueBook addIssueBook(@RequestBody IssueBook issueBook) {
        return issueBookService.issueBook(issueBook);
    }

    @GetMapping("/all")
    public List<IssueBook> getAllIssuedBooks() {
        return issueBookService.getAllIssuedBooks();
    }


    @PutMapping("/update/{id}")
    public IssueBook updateIssuedBook(@PathVariable Long id, @RequestBody IssueBook issueBook) {
        return issueBookService.updateIssuedBook(id, issueBook);
    }

    @DeleteMapping("/delete/{id}")
    public String deleteIssuedBook(@PathVariable Long id) {
        return issueBookService.deleteIssuedBook(id);
    }
    
    @GetMapping("/count/{studentId}")
    public ResponseEntity<Long> getIssuedBookCount(@PathVariable int studentId) {
        Long count = issueBookService.countIssuedBooksByStudent(studentId);
        return ResponseEntity.ok(count);
    }

}








