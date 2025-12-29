//package com.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "book")
//public class Book {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
//    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_seq", allocationSize = 1)
//    private int bookId;
//
//    @Column(nullable = false)
//    private String bookname;
//
//    @Column(nullable = false)
//    private String authorname;
//
//    @Column(nullable = false)
//    private String publication;
//
//    @Column(nullable = false)
//    private String category;
//    
////    @Column(nullable = false)
////    private String status;   // AVAILABLE, ISSUED, DAMAGED, LOST
////
////   
//
//    // ---------- Constructors ----------
//    public Book() {}
//
//    public Book(String bookname, String authorname, String publication, String category) {
//        this.bookname = bookname;
//        this.authorname = authorname;
//        this.publication = publication;
//        this.category = category;
////        this.status = status;
//    }
//
//    // ---------- Getters & Setters ----------
//	public int getBookId() {
//		return bookId;
//	}
//
//	public void setBookId(int bookId) {
//		this.bookId = bookId;
//	}
//
//	public String getBookname() {
//		return bookname;
//	}
//
//	public void setBookname(String bookname) {
//		this.bookname = bookname;
//	}
//
//	public String getAuthorname() {
//		return authorname;
//	}
//
//	public void setAuthorname(String authorname) {
//		this.authorname = authorname;
//	}
//
//	public String getPublication() {
//		return publication;
//	}
//
//	public void setPublication(String publication) {
//		this.publication = publication;
//	}
//
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//	public String getStatus() {
//		return status;
//	}
//
//	public void setStatus(String status) {
//		this.status = status;
//	}


   
//}


//
//package com.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "book")
//public class Book {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
//    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_seq", allocationSize = 1)
//    private int bookId;
//
//    @Column(nullable = false)
//    private String bookname;
//
//    @Column(nullable = false)
//    private String authorname;
//
//    @Column(nullable = false)
//    private String publication;
//
//    @Column(nullable = false)
//    private String category;
//
////    @Column(nullable = false)
////    private int quantity;        // 🔥 IMPORTANT (availability depends on this)
//
//    public Book() {}
//
//    public Book(String bookname, String authorname, String publication, String category, int quantity) {
//        this.bookname = bookname;
//        this.authorname = authorname;
//        this.publication = publication;
//        this.category = category;
////        this.quantity = quantity;
//    }
//
//    // ---------- Getters & Setters ----------
//    public int getBookId() {
//        return bookId;
//    }
//    public void setBookId(int bookId) {
//        this.bookId = bookId;
//    }
//    public String getBookname() {
//        return bookname;
//    }
//    public void setBookname(String bookname) {
//        this.bookname = bookname;
//    }
//    public String getAuthorname() {
//        return authorname;
//    }
//    public void setAuthorname(String authorname) {
//        this.authorname = authorname;
//    }
//    public String getPublication() {
//        return publication;
//    }
//    public void setPublication(String publication) {
//        this.publication = publication;
//    }
//    public String getCategory() {
//        return category;
//    }
//    public void setCategory(String category) {
//        this.category = category;
//    }

//    public int getQuantity() {
//        return quantity;
//    }
//    public void setQuantity(int quantity) {
//        this.quantity = quantity;
//    }}






package com.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "book_seq_gen")
    @SequenceGenerator(name = "book_seq_gen", sequenceName = "book_seq", allocationSize = 1)
    private int bookId;

    @Column(nullable = false)
    private String bookname;

    @Column(nullable = false)
    private String authorname;

    @Column(nullable = false)
    private String publication;

    @Column(nullable = false)
    private String category;

    public Book() {}

    public Book(String bookname, String authorname, String publication, String category) {
        this.bookname = bookname;
        this.authorname = authorname;
        this.publication = publication;
        this.category = category;
    }

    // ---------- Getters & Setters ----------
    public int getBookId() {
        return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public String getAuthorname() {
        return authorname;
    }
    public void setAuthorname(String authorname) {
        this.authorname = authorname;
    }

    public String getPublication() {
        return publication;
    }
    public void setPublication(String publication) {
        this.publication = publication;
    }

    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
}



