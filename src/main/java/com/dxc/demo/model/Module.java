package com.dxc.demo.model;

public class Module {

	private String name;
	private String desc;
	
	public Module() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Module(String name, String desc) {
		super();
		this.name = name;
		this.desc = desc;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
}
