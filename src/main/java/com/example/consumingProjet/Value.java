package com.example.consumingProjet;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Value {
	private Long id;
	private String quote;
}
