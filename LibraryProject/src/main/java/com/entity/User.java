//package com.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "USERS")
//public class User {
//
//    @Id
//    @Column(name = "user_id")
//    private Long id;   // No @GeneratedValue here
//
//    @Column(unique = true, nullable = false)
//    private String username;
//
//    private String password;
//    private String role;     // "ADMIN" or "STUDENT"
//
//    @Column(nullable = false)
//    private int active = 1;  // Default active = 1
//}


//
//package com.entity;
//
//import jakarta.persistence.*;
//import lombok.Data;
//
//@Data
//@Entity
//@Table(name = "userss")
//public class User {
//
//    @Id
//    //@GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(name = "user_id")
//    private Long id;
//
//    @Column(unique = true, nullable = false,length = 20)
//    private String username;
//
//    @Column(nullable = false,length = 20)
//    private String password;
//
//    @Column(nullable = false)
//    private String role = "STUDENT"; // default role
//
//    @Column(nullable = false)
//    private int active = 1;  // 1 = active, 0 = inactive
//}




package com.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "userss")
public class User
{
	

    @Id
    @GeneratedValue
    @Column(name = "user_id")
    private Long id;

    @Column(unique = true, nullable = false,length = 20)
    private String username;

    @Column(nullable = false,length = 20)
    private String password;

    @Column(nullable = false)
    private String role = "STUDENT"; // default role

    @Column(nullable = false)
    private int active = 1;  // 1 = active, 0 = inactive
}






