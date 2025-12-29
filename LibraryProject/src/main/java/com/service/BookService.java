


package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Book;
import com.repository.BookRepository;

@Service
public class BookService {

    @Autowired
    private BookRepository bookRepository;

    // Add book
    public Book addBook(Book book) {
        return bookRepository.save(book);
    }

    // Get all books
    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }

    // Get book by ID
    public Book getBookById(int id) {
        return bookRepository.findById(id).orElse(null);
    }

    // Search by book name
    public List<Book> getBookByName(String name) {
        return bookRepository.findByBookname(name);
    }

    // Search by author name
    public List<Book> getBookByAuthor(String author) {
        return bookRepository.findByAuthorname(author);
    }

    // Update book
    public Book updateBook(int id, Book updatedBook) {
        return bookRepository.findById(id).map(book -> {
            book.setBookname(updatedBook.getBookname());
            book.setAuthorname(updatedBook.getAuthorname());
            book.setPublication(updatedBook.getPublication());
            book.setCategory(updatedBook.getCategory());
            return bookRepository.save(book);
        }).orElse(null);
    }
    
    
    
    
}











