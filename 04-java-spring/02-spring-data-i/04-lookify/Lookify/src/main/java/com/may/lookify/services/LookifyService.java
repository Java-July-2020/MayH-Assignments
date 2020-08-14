package com.may.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.may.lookify.models.Lookify;
import com.may.lookify.repositories.LookifyRepository;

@Service
public class LookifyService {
	
	// create a private repo 
	private LookifyRepository songRepo;
	
		public LookifyService(LookifyRepository repo) {
			this.songRepo = repo;
		}
		
		// get all songs
		public List<Lookify> getAllSongs() {
			return this.songRepo.findAll(); 
		}
		
		// get one song by id
		public Lookify findSong(Long id) {
			return songRepo.findById(id).orElse(null); 
		}
		
		// get top ten songs in the descending order of rating
		public List<Lookify> topTenByRating() {
			return songRepo.findTop10ByOrderByRatingDesc(); 
		}
		
		// get song by artist name containing user query 
		public List<Lookify> songsContainingArtist(String query) {
			return songRepo.findByArtistContaining(query); 
		}
		
		// create song
		public Lookify createSong(Lookify newSong) {
			return this.songRepo.save(newSong); 
		}
		
		// create song (overloaded version which also requires an overloaded constructor in model)
		public Lookify createNewSong(String title, String artist, int rating) {
			Lookify newSong = new Lookify(title, artist, rating);
			return this.songRepo.save(newSong);
		}
		
		// update song
		public Lookify updateSong(Long id, Lookify updatedSong) {
			return this.songRepo.save(updatedSong); 
		} 

		// delete song (no return statement since we are returning void)
		public void deleteSong(Long id) {
			this.songRepo.deleteById(id);  
		}
		

		
}
