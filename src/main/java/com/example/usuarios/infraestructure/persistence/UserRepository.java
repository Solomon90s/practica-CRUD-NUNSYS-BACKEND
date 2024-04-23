package com.example.usuarios.infraestructure.persistence;

import com.example.usuarios.domain.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<User, Long> {

}
