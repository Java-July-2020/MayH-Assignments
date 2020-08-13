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
		
		// get one song
		public Lookify getOneSong(Long id) {
			Lookify song = this.songRepo.findById(id).orElse(null);
			return song;
		}
		
		// get all songs
		public List<Lookify> getAllSongs() {
			return this.songRepo.findAll();
		}
		
		// get by artist
		public List<Lookify> getByArtist(String query) {
			return this.songRepo.findByArtistContaining(query);
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
		
		// delete song (no return statement since we are returning void)
		public void deleteSong(Long id) {
			this.songRepo.deleteById(id);
		}
		
		// update song
		public Lookify updateSong(Long id, Lookify updatedSong) {
			return this.songRepo.save(updatedSong);
		} 
		
}
