//package com.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.entity.User;
//import com.repository.UserRepository;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository userRepository;
//
//    public User login(String username, String password) 
//    {
//        User user = userRepository.findByUsername(username);
//        if (user == null) return null;
//        if (!user.getPassword().equals(password)) return null;
//        if (user.getActive() == 0) return null;
//        return user;
//    }
//
//    public java.util.List<User> getAllUsers() 
//    {
//        return userRepository.findAll();
//    }
//    
//    public User add(User user)
//    {
//        return userRepository.save(user);
//    }
//
//}
//













package com.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.repository.*;
import com.entity.*;
@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public User login(String username, String password) 
    {
        User user = userRepository.findByUsername(username);
        if (user == null) return null;
        if (!user.getPassword().equals(password)) return null;
        if (user.getActive() == 0) return null;
        return user;
    }

    public java.util.List<User> getAllUsers() 
    {
        return userRepository.findAll();
    }
    
    public User add(User user)
    {
        return userRepository.save(user);
    }

}