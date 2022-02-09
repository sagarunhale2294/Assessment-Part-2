package com.addressmgmt.addressmgmt.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="person")
public class Person {
	@Id
	public int id;
	public String name;
	public String address;
	public String pin;
}
