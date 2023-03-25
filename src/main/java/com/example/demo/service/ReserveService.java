package com.example.demo.service;

import com.example.demo.model.Reserve;

import java.util.List;

public interface ReserveService {

    Reserve createReserve(Reserve reserve);

    Reserve updateReserve(Reserve reserve);

    Reserve findReserveByDocument(Integer document);

    Reserve findReserveByDay(Integer day);

    List<Reserve> findAllReserves();
}
