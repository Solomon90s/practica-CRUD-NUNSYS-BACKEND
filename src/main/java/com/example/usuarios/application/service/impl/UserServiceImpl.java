package com.example.usuarios.application.service.impl;

import com.example.usuarios.application.dto.UserDTO;
import com.example.usuarios.application.mapper.UserMapper;
import com.example.usuarios.application.service.UserService;
import com.example.usuarios.domain.entity.User;
import com.example.usuarios.domain.persistence.UserPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    private final UserPersistence persistence;
    private final UserMapper mapper;

    @Autowired
    public UserServiceImpl(UserPersistence persistence, UserMapper mapper) {
        this.persistence = persistence;
        this.mapper = mapper;
    }

    @Override
    public List<UserDTO> getAllUsers() {
        List<User> users = this.persistence.getAllUsers();
        return mapper.toDto(users);
    }

    @Override
    public Optional<UserDTO> getUserById(Long idUser) {
        return this.persistence.getUserById(idUser).map(mapper::toDto);
    }

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        User user = this.persistence.saveUser(this.mapper.toEntity(userDTO));
        return this.mapper.toDto(user);
    }

    @Override
    public void deleteUser(Long idUser) {
        this.persistence.deleteUser(idUser);
    }
}
