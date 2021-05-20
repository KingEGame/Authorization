package com.junior.springcrud.service;


import com.junior.springcrud.dto.UserDto;
import com.junior.springcrud.entity.Users;
import com.junior.springcrud.exception.ValidationException;

import static java.util.Objects.isNull;

public class DefaultUsersService {

    private void validateUserDto(UserDto usersDto) throws ValidationException {
        if (isNull(usersDto)) {
            throw new ValidationException("Object user is null");
        }
        if (isNull(usersDto.getLogin()) || usersDto.getLogin().isEmpty()) {
            throw new ValidationException("Login is empty");
        }
    }

    public Users fromUserDtoToUser(UserDto userDto) {
        Users users = new Users();
        users.setId(userDto.getId());
        users.setEmail(userDto.getEmail());
        users.setName(userDto.getName());
        users.setLogin(userDto.getLogin());
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
}
