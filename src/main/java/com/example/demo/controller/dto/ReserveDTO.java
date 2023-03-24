package com.example.demo.controller.dto;

import lombok.Setter;
import lombok.Data;
import lombok.Getter;

@Data
public class ReserveDTO {
    private String document;
    private String pet_name;
    private String reserve_date;
}


