package com.yourcompany.pollingsystem.repository;

import com.yourcompany.pollingsystem.model.Response;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ResponseRepository extends JpaRepository<Response, Long> {
}
