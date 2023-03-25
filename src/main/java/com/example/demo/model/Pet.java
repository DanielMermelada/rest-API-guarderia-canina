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
@Table(name = "Pets")
public class Pet {

    @Id
    @Column(name = "ownerdocuments", nullable = false, length = 10)
    private Integer ownerdocument;

    @Column(name = "petnames", nullable = false, length = 50)
    private String petname;

    @Column(name = "ownernames", nullable = false, length = 50)
    private String ownername;

    @Column(name = "reserveday", nullable = false, length = 370)
    private Integer reserveday;

    @Column(name = "reserveamount", nullable = false, length = 3)
    private Integer reserveamount;
}
