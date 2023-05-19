package com.leaning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentModel {

	private Long id;
	private String name;
	private Long contactDetails;
	private String qualification;
	private String email;


}
