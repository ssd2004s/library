package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.IssueBook;

public interface IssueBookRepository extends JpaRepository<IssueBook, Long>
{
	    boolean existsByBook_BookId(int bookId);
	    Long countByStudent_StudentId(int studentId);



}