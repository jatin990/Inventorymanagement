package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.orders;

public interface OrderRepository extends JpaRepository<orders,Integer> {

}
