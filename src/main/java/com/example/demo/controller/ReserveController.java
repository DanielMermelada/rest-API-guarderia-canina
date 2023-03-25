package com.example.demo.controller;
import com.example.demo.model.Reserve;
import com.example.demo.service.ReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reserves")
public class ReserveController {

    @Autowired
    private ReserveService reserveService;

    @GetMapping
    public List<Reserve> findAllReserves(){
        return reserveService.findAllReserves();
    }
    @PostMapping
    public Reserve createReserve(@RequestBody Reserve reserve){
        return reserveService.createReserve(reserve);
    }
    @PutMapping
    public Reserve updateReserve(@RequestBody Reserve reserve){
        return  reserveService.updateReserve(reserve);
    }
    @GetMapping("/{document}")
    public Reserve findReserveByDocument(@PathVariable Integer document){return reserveService.findReserveByDocument(document);}
    @GetMapping("/{day}")
    public Reserve findReserveByDay(@PathVariable Integer day){return reserveService.findReserveByDay(day);}
}
