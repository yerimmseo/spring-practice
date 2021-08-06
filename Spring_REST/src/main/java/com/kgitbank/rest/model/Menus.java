package com.kgitbank.rest.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Menus {
	@NonNull
	private String cname;
	private Integer price;
	private Integer group_id;
}
