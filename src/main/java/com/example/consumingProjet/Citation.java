package com.example.consumingProjet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Citation {
	
	private String type;
	private Value value;
	

}
