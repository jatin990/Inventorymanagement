package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.items;

public interface ItemRepository extends JpaRepository<items,Integer>{

}
