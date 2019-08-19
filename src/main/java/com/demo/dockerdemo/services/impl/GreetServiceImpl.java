package com.demo.dockerdemo.services.impl;

import com.demo.dockerdemo.models.Greet;
import com.demo.dockerdemo.repository.GreetRepository;
import com.demo.dockerdemo.services.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetServiceImpl implements GreetService {

    @Autowired
    private GreetRepository greetRepository;

    @Override
    public List<Greet> findAll() {
        return (List<Greet>) greetRepository.findAll();
    }

    @Override
    public Greet save(Greet greet) {
        return greetRepository.save(greet);
    }
}
