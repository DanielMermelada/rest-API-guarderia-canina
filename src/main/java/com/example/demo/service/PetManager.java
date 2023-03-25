package com.example.demo.service;

import com.example.demo.model.Pet;
import com.example.demo.model.Reserve;
import com.example.demo.repository.PetsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class PetManager implements PetService {

    @Autowired
    private PetsRepository petsRepo;

    @Override
    public Pet createPet(Pet pet) {
        return petsRepo.save(pet);
    }

    @Override
    public Pet updatePet(Pet pet) {
        return petsRepo.save(pet);
    }

    @Override
    public Pet findPetByDocument(Integer ownerdocument) {
        Optional<Pet> optionalPet = petsRepo.findById(ownerdocument);
        return optionalPet.orElse(null);
    }

    @Override
    public Pet findReserveByDay(Integer reserveday) {
        Optional<Pet> optionalPet = petsRepo.findById(reserveday);
        return optionalPet.orElse(null);
    }

    @Override
    public List<Pet> findAllPets() {
        return petsRepo.findAll();
    }
}

