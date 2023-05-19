package com.leaning.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseModel {

	private Long id;
	private String name;
	private String curriculum;
	private String duration;

}
