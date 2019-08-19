package com.demo.dockerdemo.repository;

import com.demo.dockerdemo.models.Greet;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GreetRepository extends CrudRepository<Greet, Long> {

}
