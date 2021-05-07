package com.midapp.spring_app.repo;

import com.midapp.spring_app.models.Users1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users1,Integer> {
    Users1  findByUsername(String username);
}
