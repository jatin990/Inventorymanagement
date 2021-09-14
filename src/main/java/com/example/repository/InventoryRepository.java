package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.inventory;
import com.example.models.items;

public interface InventoryRepository extends JpaRepository<inventory,Integer>{

}
