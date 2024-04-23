package com.example.usuarios.application.mapper;

import java.util.List;

public interface EntityMapper<Dto, Entidad> {
    Entidad toEntity(Dto dto);
    Dto toDto(Entidad entidad);
    List<Entidad> toEntity(List<Dto> dtoList);
    List<Dto> toDto(List<Entidad> entidadList);

}
