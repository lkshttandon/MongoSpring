package com.dxc.demo.model;

import java.util.List;

import org.springframework.data.annotation.Id;

public class Track {
	
	@Id
	private String id;
	private String name;
	
	private List<Module> modules;

	public Track() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Track(String id, String name, List<Module> modules) {
		super();
		this.id = id;
		this.name = name;
		this.modules = modules;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Module> getModules() {
		return modules;
	}

	public void setModules(List<Module> modules) {
		this.modules = modules;
	}
	
}
