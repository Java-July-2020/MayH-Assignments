package com.may.petswithafrontend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.may.petswithafrontend.models.Toy;

@Repository
public interface ToyRepository extends CrudRepository<Toy, Long>{

}
