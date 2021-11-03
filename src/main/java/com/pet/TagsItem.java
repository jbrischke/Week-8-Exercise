package com.pet;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TagsItem{

	@JsonProperty("name")
	private String name;

	@JsonProperty("id")
	private int id;

	public String getName(){
		return name;
	}

	public int getId(){
		return id;
	}

	@Override
	public String toString() {
		return "TagsItem{" +
				"name='" + name + '\'' +
				", id=" + id +
				'}';
	}
}