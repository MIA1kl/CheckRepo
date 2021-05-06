package com.midapp.spring_app.repo;

import com.midapp.spring_app.models.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<Users,Integer> {
    Users  findByUsername(String username);
}
