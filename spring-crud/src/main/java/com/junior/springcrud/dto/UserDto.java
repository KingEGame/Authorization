package com.junior.springcrud.dto;


import lombok.Builder;
import lombok.Data;

@Data
public class UserDto {

    private Integer id;
    private String name;
    private String login;
    private String email;

}
