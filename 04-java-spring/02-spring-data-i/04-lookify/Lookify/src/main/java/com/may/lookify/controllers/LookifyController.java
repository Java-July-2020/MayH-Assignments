package com.may.lookify.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.may.lookify.models.Lookify;
import com.may.lookify.services.LookifyService;

@Controller
public class LookifyController {
	
	// create a private Service
	private LookifyService songService;
	
	public LookifyController(LookifyService songService) {
		this.songService = songService;
	}
	
	// Landing Page
	@RequestMapping("/")
	public String index() {
		return "index.jsp";
	}
	
	// Dashboard
	@RequestMapping("/dashboard")
	public String dashboard(Model viewModel) {
		List<Lookify> songs = songService.getAllSongs();
		System.out.println("SONGS: "+ songs);
		viewModel.addAttribute("songs", songs);
		return "dashboard.jsp";
	}

	// Show detail page of the song clicked
	@RequestMapping("/songs/{id}")
	public String Show(@PathVariable("id") Long id, Model model) {
		model.addAttribute("song", songService.findSong(id));
		return "/show.jsp";
	}
	
	// Show songs containing user's search query
	@RequestMapping("/songs/search")
	public String Search(@RequestParam("artist") String artist, Model model) {
		model.addAttribute("songs",	songService.songsContainingArtist(artist));
		model.addAttribute("artist", artist);
		return "/searched.jsp";
	}
	
	// Page that allows user to create new song 
	@RequestMapping("/songs/new")
	public String New(@ModelAttribute("song") Lookify song) {
		return "/newSong.jsp";
	}
	
	// If request param has errors, reload the page. Otherwise, redirect to the dashboard.
	@RequestMapping(value="/songs", method=RequestMethod.POST)
	public String Create(@Valid @ModelAttribute("song") Lookify song, BindingResult result) {
		if(result.hasErrors()) {
			return "/newSong.jsp";
		} else {
			songService.createSong(song);
			return "redirect:/dashboard";
		}
	}
	
	// Page that shows the top ten songs in descending order by rating
	@RequestMapping("/songs/topTen")
	public String TopTen(Model model) {
		model.addAttribute("songs", songService.topTenByRating());
		return "topTenSongs.jsp";
	}
	
	// Delete song by id 
	@RequestMapping(value="/songs/{id}", method=RequestMethod.DELETE)
	public String deleteSong(@PathVariable("id") Long id) {
		songService.deleteSong(id);
	    return "redirect:/dashboard";
	}
	

}
