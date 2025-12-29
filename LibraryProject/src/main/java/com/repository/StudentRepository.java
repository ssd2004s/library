//package com.repository;
//
//
//
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.stereotype.Repository;
//
//import com.entity.Student;
//
//@Repository
//public interface StudentRepository extends JpaRepository<Student, Long>
//{
//	
//}



package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
