package com.example.userService.Service;

import com.example.userService.domain.Role;
import com.example.userService.domain.User;
import org.springframework.stereotype.Service;

import java.util.List;
public interface UserService {
     User saveUser(User user);
     Role saveRole(Role role);
     void addRoleToUser(String username,String roleName);
     User getUser(String username);
     List<User> getUsers();
}
