package com.example.demo.service;

import com.example.demo.model.Reserve;
import com.example.demo.repository.ReservesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class ReserveManager implements ReserveService {

    @Autowired
    private ReservesRepository reservesRepo;

    @Override
    public Reserve createReserve(Reserve reserve) {
        return reservesRepo.save(reserve);
    }

    @Override
    public Reserve updateReserve(Reserve reserve) {
        return reservesRepo.save(reserve);
    }

    @Override
    public Reserve findReserveByDocument(Integer document) {
        Optional<Reserve> optionalReserve = reservesRepo.findById(document);
        return optionalReserve.orElse(null);
    }

    @Override
    public Reserve findReserveByDay(Integer day) {
        Optional<Reserve> optionalReserveDay = reservesRepo.findById(day);
        return optionalReserveDay.orElse(null);
    }

    @Override
    public List<Reserve> findAllReserves() {
        return reservesRepo.findAll();
    }
}
