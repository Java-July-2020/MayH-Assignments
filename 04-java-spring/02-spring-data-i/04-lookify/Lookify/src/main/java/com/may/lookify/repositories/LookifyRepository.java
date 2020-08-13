package com.may.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.may.lookify.models.Lookify;

public interface LookifyRepository extends CrudRepository<Lookify, Long>{
	List<Lookify> findAll();
	// List<Lookify> findByArtistContaining(String query);
}
