package com.yuzf.pojo;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Data;

@Data
@JsonSerialize
public class User {
	
	private String username;
	
	
	private String password;
	
}
