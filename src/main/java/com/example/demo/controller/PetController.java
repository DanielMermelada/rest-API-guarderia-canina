package com.example.demo.controller;

import com.example.demo.model.Pet;
import com.example.demo.service.PetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/pets")
public class PetController {

    @Autowired
    private PetService petService;

    @GetMapping
    public List<Pet> findAllPets(){
        return petService.findAllPets();
    }
    @PostMapping
    public Pet createPet(@RequestBody Pet pet){
        return petService.createPet(pet);
    }
    @PutMapping
    public Pet updatePet(@RequestBody Pet pet){
        return  petService.updatePet(pet);
    }
    @GetMapping("/{ownerdocument}")
    public Pet findByDocument(@PathVariable Integer ownerdocument){
        return petService.findPetByDocument(ownerdocument);
    }
    @GetMapping("/{reserveday}")
    public Pet findReserveByDay(@PathVariable Integer reserveday){
        return petService.findReserveByDay(reserveday);
    }
}
