package com.dxc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.demo.model.Track;
import com.dxc.demo.repo.TrackRepository;

@RestController
public class TrackController {
	
	@Autowired
	private TrackRepository trackRepo;
	
	@PostMapping("/track")
	public void create(@RequestBody Track track) {
		//trackRepo.save(track); we use this for update and create
		trackRepo.insert(track);
	}

	@GetMapping("/track")
	public List<Track> findAll() {
		return trackRepo.findAll();
	}
	
	@PutMapping("/track")
	public void update(@RequestBody Track track) {
		trackRepo.save(track);
	}

//We can also use this for update function
//	@PutMapping("/track")
//	public Track update(@PathVariable String id, @RequestBody Track track) {
//		track.setId(id);
//		trackRepo.save(track);
//		return track; //we use return type in this as we are making changes in track object.
//	}


	@DeleteMapping("/track/{id}")
	public void remove(@PathVariable String id) {
		trackRepo.deleteById(id);
	}
}
