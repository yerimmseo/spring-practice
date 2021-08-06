package com.kgitbank.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Department {
	@NonNull
	private Integer department_id;
	@NonNull
	private String department_name;
	private Integer manager_id;
	private Integer location_id;
}
