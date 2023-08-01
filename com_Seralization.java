package com.practice.Collection_Methods;

import java.io.Serializable;

public class com_Seralization implements Serializable {

	private static final long serialVersionUID = 1L;
private int id;
private String name;


public com_Seralization(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
@Override
public String toString() {
	return "com_Seralization [id=" + id + ", name=" + name + "]";
}


}
