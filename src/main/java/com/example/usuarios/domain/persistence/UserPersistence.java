package com.example.usuarios.domain.persistence;

import com.example.usuarios.domain.entity.User;


import java.util.List;
import java.util.Optional;

public interface UserPersistence {
    List<User> getAllUsers();
    Optional<User> getUserById(Long idUser);
    User saveUser(User user);
    void deleteUser(Long idUser);
}
