package com.yourcompany.pollingsystem.repository;

import com.yourcompany.pollingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
