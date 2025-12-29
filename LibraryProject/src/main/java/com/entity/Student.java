//package com.entity;
//
//
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "students")
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long studentId;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false, unique = true)
//    private String rollNo;
//
//    @Column(nullable = false, unique = true)
//    private String email;
//
//    @Column(nullable = false)
//    private String mobileNumber;
//
//    @Column(nullable = false)
//    private String department;
//
//    @Column(nullable = false, unique = true)
//    private String username;
//    
//    
//    @Column(name = "password", nullable = false,unique=true)
//    private String password;
//    
//
//    public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) 
//	{
//		this.password = password;
//	}
//
//	// Getters and Setters
//    public Long getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(Long studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(String rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//}
//




//
//
//package com.entity;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "students")
//public class Student {
//
//    @Id
////    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(nullable = false, unique = true)
//    private Long studentId;
//
//    @Column(nullable = false)
//    private String name;
//
//    @Column(nullable = false, unique = true)
//    private String rollNo;
//
//    @Column(nullable = false, unique = true)
//    private String email;
//
//    @Column(nullable = false)
//    private String mobileNumber;
//
//    @Column(nullable = false)
//    private String department;
//
//    @Column(nullable = false, unique = true)
//    private String username;
//
//    @Column(nullable = false)
//    private String password;
//
////     Getters and Setters
//    public Long getStudentId() {
//        return studentId;
//    }
//
//    public void setStudentId(Long studentId) {
//        this.studentId = studentId;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getRollNo() {
//        return rollNo;
//    }
//
//    public void setRollNo(String rollNo) {
//        this.rollNo = rollNo;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getMobileNumber() {
//        return mobileNumber;
//    }
//
//    public void setMobileNumber(String mobileNumber) {
//        this.mobileNumber = mobileNumber;
//    }
//
//    public String getDepartment() {
//        return department;
//    }
//
//    public void setDepartment(String department) {
//        this.department = department;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }
//
//    public String getPassword() {
//        return password;
//    }
//
//    public void setPassword(String password) {
//        this.password = password;
//    }
//}
//
//
//

//
//package com.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "studentss")
//public class Student {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long studentId;
//
//    @Column(nullable = false,length = 12)
//    private String name;
//
//    @Column(nullable = false, unique = true,length = 20)
//    private String rollNo;
//
//    @Column(nullable = false, unique = true,length = 20)
//    private String email;
//
//    @Column(nullable = false,length = 20)
//    private String mobileNumber;
//
//    @Column(nullable = false,length = 20)
//    private String department;
//
//    @Column(nullable = false, unique = true,length = 20)
//    private String username;
//
//    @Column(nullable = false,length = 20)
//    private String password;
//}









package com.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "studentss")
public class Student 
{

    @Id
//    @GeneratedValue
    private Long studentId;

    @Column(nullable = false,length = 12)
    private String name;

    @Column(nullable = false, unique = true,length = 20)
    private String rollNo;

    @Column(nullable = false, unique = true,length = 20)
    private String email;

    @Column(nullable = false,length = 20)
    private String mobileNumber;

    @Column(nullable = false,length = 20)
    private String department;

    @Column(nullable = false, unique = true,length = 20)
    private String username;

    @Column(nullable = false,length = 20)
    private String password;
}
