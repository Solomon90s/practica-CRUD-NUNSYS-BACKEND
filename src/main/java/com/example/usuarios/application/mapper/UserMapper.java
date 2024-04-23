package com.example.usuarios.application.mapper;


import com.example.usuarios.application.dto.UserDTO;
import com.example.usuarios.domain.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends EntityMapper<UserDTO, User> {

}
