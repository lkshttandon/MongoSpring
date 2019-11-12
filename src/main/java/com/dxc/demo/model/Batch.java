package com.dxc.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;

public class Batch {

	@Id
	private String id;

	@DBRef
	private List<Employee> employees; // To set a list of values

	@DBRef
	private Track tracks;

	public Batch() {
		super();
	}

	public Batch(String id, List<Employee> employees, Track tracks) {
		super();
		this.id = id;
		this.employees = employees;
		this.tracks = tracks;
	}

	public Track getTracks() {
		return tracks;
	}

	public void setTracks(Track tracks) {
		this.tracks = tracks;
	}

	public Batch(String id, List<Employee> employees) {
		super();
		this.id = id;
		this.employees = employees;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}

