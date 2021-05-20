package com.junior.springcrud.service;

import com.junior.springcrud.dto.UserDto;
import java.util.List;

public interface UsersService {

    UserDto saveUser(UserDto usersDto);

    void deleteUser(Integer userId);

    UserDto findByLogin(String login);

    List<UserDto> findAll();
}