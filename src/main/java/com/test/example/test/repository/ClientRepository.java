package com.test.example.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.test.example.test.model.Client;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
