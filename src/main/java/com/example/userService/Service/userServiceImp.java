package com.example.userService.Service;

import com.example.userService.Rero.RoleRepo;
import com.example.userService.Rero.UserRepo;
import com.example.userService.domain.Role;
import com.example.userService.domain.User;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

//@RequiredArgsConstructor
@Transactional
//@Slf4j
@Service
public class userServiceImp implements UserService {

    @Autowired
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    public userServiceImp(UserRepo userRepo,RoleRepo roleRepo){
        this.userRepo=userRepo;
        this.roleRepo=roleRepo;
    }
    @Override
    public User saveUser(User user) {
        //log.info("save new user {} to database",user.getUsername());
        return userRepo.save(user);
    }

    @Override
    public Role saveRole(Role role) {
      //  log.info("save new role {} in database",role.getName());
        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String username, String roleName) {
        //log.info("add role {} to user {} and save in database",roleName,username);
        User user= userRepo.findByUsername(username);
        Role role= roleRepo.findByName(roleName);
        user.getRoles().add(role);


    }

    @Override
    public User getUser(String username) {
        //log.info("fetching user",username);
        return userRepo.findByUsername(username);
    }

    @Override
    public List<User> getUsers() {
        //log.info("fetching all users");
        return userRepo.findAll();
    }
}
