package com.may.petswithafrontend.services;

import org.springframework.stereotype.Service;

import com.may.petswithafrontend.models.Tag;
import com.may.petswithafrontend.repositories.TagRepository;

@Service
public class TagService {
	private TagRepository repo;
	private TagService(TagRepository repo) {
		this.repo = repo;
	}
	
	// Create
	public Tag create(Tag tag) {
		System.out.println("creating: " + tag);
		return this.repo.save(tag);
	}
}
