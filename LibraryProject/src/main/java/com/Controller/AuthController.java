//package com.Controller;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.*;
//import com.entity.User;
//import com.service.UserService;
//import com.repository.UserRepository;
//
//@RestController
//@CrossOrigin("*")
//@RequestMapping("/auth")
//public class AuthController {
//
//    @Autowired
//    private UserService userService;
//
//    @Autowired
//    private UserRepository userRepository;
//
//
//    // Login API
//    @PostMapping("/login")
//    public User login(@RequestParam String username,
//                      @RequestParam String password) 
//    {
//        return userService.login(username, password);
//    }
//
//         
//    // Get All Users
//    @GetMapping("/all")
//    public List<User> getAllUsers() 
//    
//    {
//        return userRepository.findAll();
//    }
//}




package com.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.entity.User;
import com.service.UserService;

@RestController
@CrossOrigin("*")
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public User login(@RequestParam String username,
                      @RequestParam String password) {
        return userService.login(username, password);
    }
}



















