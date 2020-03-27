package com.tech.developer.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class Person implements Serializable{
	
	private String name;
	
	private String email;
	
	private String mobile;
	
	private String birthday;
	
	private String time;
	
	private String month;
	
	private String week;
	
	private Gender gender;
	
	private List<Tech> tech = new ArrayList<>();
	
	private String color;
	
	private String password;
	
	private String range;

}
