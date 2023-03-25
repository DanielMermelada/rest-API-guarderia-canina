package com.example.demo.repository;

import com.example.demo.model.Reserve;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReservesRepository extends JpaRepository<Reserve, Integer> {
}
