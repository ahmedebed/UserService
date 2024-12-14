package com.example.userService.Rero;

import com.example.userService.domain.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface roleRepo extends JpaRepository<Role,Long> {
    Role findByName(String name);
}
