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
@Table(name = "Clients")
public class Client {

    @Id
    @Column(name = "documents", nullable = false, length = 10)
    private Integer document;

    @Column(name = "names", nullable = false, length = 50)
    private String name;

    @Column(name = "adresses", nullable = false, length = 100)
    private String address;

    @Column(name = "pets", nullable = true, length = 50)
    private String pet;

}
