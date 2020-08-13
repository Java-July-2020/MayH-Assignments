package com.may.lookify.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.may.lookify.models.Lookify;
import com.may.lookify.services.LookifyService;

@Controller
public class LookifyController {
	
	private LookifyService songService;
	
	public LookifyController(LookifyService songService) {
		this.songService = songService;
	}
	
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	@RequestMapping("/dashboard")
	public String dashboard(Model viewModel) {
		List<Lookify> songs = this.songService.getAllSongs();
		viewModel.addAttribute("songs", songs);
		return "dashboard.jsp";
	}
	
	@RequestMapping("/songs/new")
	public String newSong() {
		return "newSong.jsp";
	}
	
	@RequestMapping(value="/songs", method=RequestMethod.POST)  
	public String newSongAdded(
			@RequestParam("title") String title, 
			@RequestParam("artist") String artist, 
			@RequestParam("rating") int rating,
			RedirectAttributes redirectAttributes) {
		ArrayList<String> errors = new ArrayList<String>();
		if(title.equals("")) {
			// Flag Bad Validation
			errors.add("Hey there, you forgot to add the title of the song.");
		}
		if(artist.equals("")) {
			errors.add("Who sang this song? Make sure to add the artist's name!");
		}
		if(rating < 0 || rating > 10) {
			errors.add("Please enter a rating between 1-10.");
		}
		if(errors.size() > 0) {
			for(String e: errors) {
				redirectAttributes.addFlashAttribute("errors", e);
			}
			return "redirect:/songs/new";
		}
		// Add a new song to the database
		this.songService.createNewSong(title, artist, rating);
		return "newSong.jsp";
	}
	
	//@RequestMapping(value="/songs/${id}", method=RequestMethod.DELETE)
	//public String deleteSong(@PathVariable("id") Long id) {
	//	this.songService.deleteSong(id);
	//	return "redirect:/dashboard";
	//}
	
	//create /songs/${id} to delete
	
	
}
