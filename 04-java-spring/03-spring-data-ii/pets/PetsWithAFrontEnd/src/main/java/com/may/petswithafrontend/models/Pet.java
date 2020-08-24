package com.may.petswithafrontend.models;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

@Entity
@Table(name="pets")
public class Pet {
	
	// Validations
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@Size(min=1, max=15)
	private String name;
	@NotNull
	private String species;
	private int age;
	
	@OneToOne(mappedBy="pet", cascade=CascadeType.ALL, fetch=FetchType.LAZY) 
	private Tag tag;
	@OneToMany(mappedBy="pet", cascade=CascadeType.ALL, fetch=FetchType.LAZY) 
	private List<Toy> toys;

	@Column(updatable=false)
    @DateTimeFormat(pattern = "MM/dd/yyy HH/mm/ss")
	private Date createdAt;
	@DateTimeFormat(pattern = "MM/dd/yyy HH/mm/ss")
	private Date updatedAt;
	
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	// Constructors 
	public Pet() {
	}

	public Pet(@Size(min = 1, max = 15) String name, String species, int age) {
		this.name = name;
		this.species = species;
		this.age = age;
	}
	
	// Getters & Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public Tag getTag() {
		return tag;
	}

	public void setTag(Tag tag) {
		this.tag = tag;
	}
	
	public List<Toy> getToys() {
		return toys;
	}

	public void setToys(List<Toy> toys) {
		this.toys = toys;
	}

}