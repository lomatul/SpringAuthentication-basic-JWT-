package com.example.JWT_Token_Auth.Service;

import com.example.JWT_Token_Auth.Entity.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

@Service
public interface UserService extends UserDetailsService {
    UserDetails loadUserByUsername (String username);
    void saveUser (User user);
}
