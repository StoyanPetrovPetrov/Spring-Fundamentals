package com.example.mobilele2.model.mapper;

import com.example.mobilele2.model.dto.user.UserRegisterDTO;
import com.example.mobilele2.model.entity.UserEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    @Mapping(target = "active", constant = "true")
    UserEntity userDtoToUserEntity(UserRegisterDTO registerDTO);
}
