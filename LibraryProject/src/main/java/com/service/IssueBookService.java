package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entity.IssueBook;
import com.repository.IssueBookRepository;

import java.util.List;

@Service
public class IssueBookService {

    @Autowired
    private IssueBookRepository issueBookRepository;

    // Add issue book
    public IssueBook issueBook(IssueBook issueBook) {
        return issueBookRepository.save(issueBook);
    }

    // Get all issued books
    public List<IssueBook> getAllIssuedBooks() {
        return issueBookRepository.findAll();
    }

    // Get by id
  

    // Update
    public IssueBook updateIssuedBook(Long id, IssueBook updated) {
        return issueBookRepository.findById(id).map(issue -> {
            issue.setIssuedDate(updated.getIssuedDate());
            issue.setReturnDate(updated.getReturnDate());
            issue.setBook(updated.getBook());
            issue.setStudent(updated.getStudent());
            return issueBookRepository.save(issue);
        }).orElse(null);
    }

    // Delete
    public String deleteIssuedBook(Long id) {
        issueBookRepository.deleteById(id);
        return "IssueBook deleted with id: " + id;
    }
    
    public Long countIssuedBooksByStudent(int studentId) {
        return issueBookRepository.countByStudent_StudentId(studentId);
    }

}














