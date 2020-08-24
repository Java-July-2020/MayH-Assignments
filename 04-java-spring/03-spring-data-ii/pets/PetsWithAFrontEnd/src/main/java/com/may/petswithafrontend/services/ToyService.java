package com.may.petswithafrontend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.may.petswithafrontend.models.Toy;
import com.may.petswithafrontend.repositories.ToyRepository;

@Service
public class ToyService {

@Autowired  // another way to inject
private ToyRepository repo;

	public Toy create(Toy toy) {
		return this.repo.save(toy);
	}
}
