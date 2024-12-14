package com.example.userService.Rero;

import com.example.userService.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface userRepo extends JpaRepository<User,Long> {
    User findByUserName(String username);
}
