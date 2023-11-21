package com.example.Main.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Info {

	private Integer pinCode;
	private String state;
	private String city;
	private String country;
	
}
