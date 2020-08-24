package com.may.petswithafrontend.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.may.petswithafrontend.models.Pet;
import com.may.petswithafrontend.repositories.PetRepository;

@Service
public class PetService {
private PetRepository pRepo;

	public PetService(PetRepository repo) {
		this.pRepo = repo;
	}
	
	// Get One (By Id)
	public Pet getOnePet(Long id) {
		Pet pet = this.pRepo.findById(id).orElse(null);
		return pet;
	}
	
	// Get All Pets (List)
	public List<Pet> getAllPets() {
		return this.pRepo.findAll();
	}
	
	// Create Pet
	public Pet createPet(Pet newPet) {
		return this.pRepo.save(newPet);
	}
	
	public Pet createPet(String name, String species, int age) {
		Pet newPet = new Pet(name, species, age);
		return this.pRepo.save(newPet);
	}
	
	// Delete Pet
	public void deletePet(Long id) {
		this.pRepo.deleteById(id);
	}
	
	// Update Pet
	public Pet updatePet(Pet updatedPet) {
		return this.pRepo.save(updatedPet);
	}
}
