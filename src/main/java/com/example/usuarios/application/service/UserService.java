package com.example.usuarios.application.service;

import com.example.usuarios.application.dto.UserDTO;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<UserDTO> getAllUsers();
    Optional<UserDTO> getUserById(Long idUser);
    UserDTO saveUser(UserDTO userDTO);
    void deleteUser(Long idUser);

}
