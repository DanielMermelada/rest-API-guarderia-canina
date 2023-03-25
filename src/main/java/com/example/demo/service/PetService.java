package com.example.demo.service;

import com.example.demo.model.Pet;

import javax.persistence.criteria.CriteriaBuilder;
import java.util.List;

public interface PetService {

    Pet createPet(Pet pet);

    Pet updatePet(Pet pet);

    Pet findPetByDocument(Integer ownerdocument);

    Pet findReserveByDay(Integer reserveday);

    List<Pet> findAllPets();
}
