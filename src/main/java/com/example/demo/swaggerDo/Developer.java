package com.example.demo.swaggerDo;

import io.swagger.annotations.ApiModelProperty;

public class Developer {
	
	@ApiModelProperty(notes = "Developer's ID")
	private String id;
	
	@ApiModelProperty(notes = "Developer Name")
	private String name;
	
	@ApiModelProperty(notes = "Developer Skills")
	private String skills;
	

	public Developer() {
		super();
	}


	public Developer(String id, String name, String skills) {
		super();
		this.id = id;
		this.name = name;
		this.skills = skills;
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

	public String getSkills() {
		return skills;
	}


	public void setSkills(String skills) {
		this.skills = skills;
	}
	
	
	

}
