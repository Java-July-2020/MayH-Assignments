package com.may.show.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

@Entity  // represents an entity model for our application
@Table(name="books") // sets this as a table in the database
public class Book {
	
	private static final String DATE_FORMAT = "MM/dd/yyyy HH:mm:ss"; // constant to make sure 'createdAt' and 'updatedAt' have the same format

	// I) Class Attributes
	
    @Id // sets this as the primary key
    @GeneratedValue(strategy = GenerationType.IDENTITY) // sets this as an auto-incrementing value
    private Long id;
    
    @Column(nullable = false)    
    @Size(min = 5, max = 200) // adds validation that the column must be in the specified range
    private String title;
    
    @Column(nullable = false)    
    @Size(min = 5, max = 200)
    private String description;
    
    @Column(nullable = false)    
    @Size(min = 3, max = 40)
    private String language;
    
    @Column(nullable = false)
    @Min(100) // adds validation that the column must be at least the specified value
    private int numberOfPages;
    
    @Column(updatable=false) // This will not allow the createdAt column to be updated after creation
    @DateTimeFormat(pattern = DATE_FORMAT)
    private Date createdAt;
    
    @Column
    @DateTimeFormat(pattern = DATE_FORMAT)
    private Date updatedAt;

    
    // II) Class Constructor Methods

    public static Book newEnglishBook(String title, String desc, int pages) {
    	return new Book(title, desc, "en", pages);
    }

    public Book(String title, String desc, String lang, int pages) {
        this.title = title;
        this.description = desc;
        this.language = lang;
        this.numberOfPages = pages;
    }
	
    // III) Getter and Setters Methods
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
    
	// IV) Lifecycle Callback Methods
    
    @PrePersist // runs the method right before the object is created
    protected void onCreate(){
        this.createdAt = new Date();
    }
    @PreUpdate // runs a method when the object is modified
    protected void onUpdate(){
        this.updatedAt = new Date();
    }
}
