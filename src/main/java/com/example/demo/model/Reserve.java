package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@AllArgsConstructor
@Getter
@Setter
@Table(name = "Reserves")
public class Reserve {

    @Id
    @Column(name = "documents", nullable = false, length = 10)
    private Integer document;

    @Column(name = "owners", nullable = false, length = 50)
    private String owner;

    @Column(name = "day", nullable = false, length = 370)
    private Integer day;

    @Column(name = "pets", nullable = false, length = 50)
    private String pet;

}
