package com.demo.dockerdemo.services;

import com.demo.dockerdemo.models.Greet;

import java.util.List;

public interface GreetService {

    List<Greet> findAll();

    Greet save(Greet greet);
}
