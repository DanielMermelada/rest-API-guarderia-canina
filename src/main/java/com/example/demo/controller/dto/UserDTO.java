package com.example.demo.controller.dto;

import lombok.Setter;
import lombok.Data;
import lombok.Getter;

@Data
public class UserDTO {
    private String owner_name;
    private String document;
    private String address;
    private String pet_name;
}

