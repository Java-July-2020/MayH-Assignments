package com.may.petswithafrontend.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.may.petswithafrontend.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag, Long> {

}
