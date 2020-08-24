package com.may.petswithafrontend.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.may.petswithafrontend.models.Pet;
import com.may.petswithafrontend.models.Tag;
import com.may.petswithafrontend.services.PetService;
import com.may.petswithafrontend.services.TagService;

@Controller
public class PetController {

private PetService pService;
private TagService tService;

	public PetController(PetService service, TagService tService) {
		this.pService = service;
		this.tService = tService;
	}

	@RequestMapping("/")
	public String index(Model viewModel) {
		List<Pet> pets = this.pService.getAllPets();
		viewModel.addAttribute("pets", pets);
		return "index.jsp";
	}
	
	@RequestMapping("/new")
	public String create(@ModelAttribute("pet") Pet pet) {
		return "new.jsp";
	}
	
	@RequestMapping(value="/", method=RequestMethod.POST)
	public String createPet(@Valid @ModelAttribute("pet") Pet pet, BindingResult result) {
		if(result.hasErrors()) {
			// if an invalid input has been received
			return "new.jsp";
		} else {
			// valid inputs received; create a Pet class
			this.pService.createPet(pet);
		}
		return "redirect:/new";
	}
	
	@RequestMapping("/{id}")
	public String viewPet(@PathVariable("id") Long id, Model model, @ModelAttribute("tag") Tag tag) {
		model.addAttribute("pet", pService.getOnePet(id));
		return "show.jsp";
	}
	
	@PostMapping("/tag")
	public String createTag(@Valid @ModelAttribute("tag") Tag tag, BindingResult result, Model model) {
		System.out.println("creatinggg " + tag.getId());
		Long petId = tag.getPet().getId();
		if (result.hasErrors()) {
			model.addAttribute("pet", pService.getOnePet(petId));
			return "show.jsp";
		} else {
			this.tService.create(tag);
			return "redirect:/" + petId;
		}
	}
	
	@RequestMapping(value="/{id}", method=RequestMethod.PUT)
	public String updatePet(@Valid @ModelAttribute("pet") Pet updatedPet, BindingResult result) {
		if(result.hasErrors()) {
			return "show.jsp";
		} else {
			pService.updatePet(updatedPet);
			return "redirect:/";
		}
	}
	
//	@RequestMapping(value="/", method=RequestMethod.POST)
//	public String newPet(@RequestParam("name") String name, @RequestParam("species") String species, @RequestParam("age") int age) {
//		System.out.println(name + " " + species + " " + age);
//		// Add a new pet
//		this.pService.createPet(name, species, age);
//		return "redirect:/";
//	}
}
