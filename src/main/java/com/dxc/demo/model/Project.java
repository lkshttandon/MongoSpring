package com.dxc.demo.model;

public class Project {
	private String title;
	private String Id;

	public Project(String Id,String title) {
		super();
		this.Id = Id;
		this.title = title;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}
	
	
}
