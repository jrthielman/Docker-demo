package com.demo.dockerdemo.api;

import com.demo.dockerdemo.models.Greet;
import com.demo.dockerdemo.services.GreetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/greet")
public class GreetEndpoint {

    @Autowired
    GreetService greetService;

    @GetMapping
    public List<String> list(){

        List<String> greetings = new ArrayList<>();

        for(Greet greet : greetService.findAll()){
            greetings.add(greet.getMessage());
        }

        return greetings;
    }

    @PostMapping
    public Greet add(@RequestBody Greet greet){
        return greetService.save(greet);
    }
}
