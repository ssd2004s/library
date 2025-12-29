//package com.repository;
//
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//import com.entity.Book;
//
//@Repository
//public interface BookRepository extends JpaRepository<Book, Integer> 
//{
//	List<Book> findByBookname(String name); 
//	  List<Book> findByAuthorname(String authorname);
//}




package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

    List<Book> findByBookname(String bookname);

    List<Book> findByAuthorname(String authorname);
}



