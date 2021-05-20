package com.junior.springcrud.service;

import com.junior.springcrud.dto.UserDto;
import com.junior.springcrud.entity.Users;
import org.springframework.stereotype.Component;

@Component
public class UsersConverter {

    public Users fromUserDtoToUser(UserDto usersDto) {
        Users users = new Users();
        users.setId(usersDto.getId());
        users.setEmail(usersDto.getEmail());
        users.setName(usersDto.getName());
        users.setLogin(usersDto.getLogin());
        return users;
    }

    public UserDto fromUserToUserDto(Users users) {
        return UserDto.builder()
                .id(users.getId())
                .email(users.getEmail())
                .login(users.getLogin())
                .name(users.getName())
                .build();
    }
}}
