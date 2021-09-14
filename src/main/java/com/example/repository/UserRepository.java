package com.example.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.models.users;

public interface UserRepository extends JpaRepository<users,Integer> {

}
