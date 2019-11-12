package com.dxc.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.demo.model.Batch;
import com.dxc.demo.repo.BatchRepository;
import com.dxc.demo.repo.EmployeeRepository;
import com.dxc.demo.repo.TrackRepository;

@RestController
public class BatchController {

	@Autowired
	private BatchRepository batchRepo;

	@PostMapping("/batches")
	public void create(@RequestBody Batch batch) {
		batchRepo.save(batch);

	}
	
	@GetMapping("/batches")
	public List<Batch> findAll(){
		return batchRepo.findAll();
	}

}
