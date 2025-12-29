//package com.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//import java.util.Date;
//
//@Data
//@Entity
//@Table(name = "issuebook")
//public class IssueBook {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    // ---------- Foreign Keys ----------
//    @ManyToOne
//    @JoinColumn(name = "student_id", referencedColumnName = "studentId", nullable = false)
//    private Student student;
//
//    @ManyToOne
//    @JoinColumn(name = "book_id", referencedColumnName = "bookId", nullable = false)
//    private Book book;
//
//
//    private Date issuedDate;
//    private Date returnDate;
//}






package com.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;

@Data
@Entity
@Table(name = "issuebook")
public class IssueBook {

  @Id
  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "issue_seq")
  @SequenceGenerator(name = "issue_seq", sequenceName = "issue_seq", allocationSize = 1)
  private Long id;

  @Column(name = "issued_date")
  private Date issuedDate;

  @Column(name = "return_date")
  private Date returnDate;

  // ---------- STUDENT OBJECT ----------
  @ManyToOne
  @JoinColumn(name = "student_id")
  private Student student;

  // ---------- BOOK OBJECT ----------
  @ManyToOne
  @JoinColumn(name = "book_id")
  private Book book;
}