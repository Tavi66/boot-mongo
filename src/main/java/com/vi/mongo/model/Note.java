package com.vi.mongo.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="notes")
public class Note {
private Integer id;
private String name;
private String description;
private String category;
private Date date;

public Integer getId() {
	return id;
}
public void setId(Integer id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getCategory() {
	return category;
}
public void setCategory(String category) {
	this.category = category;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
@Override
public String toString() {
	return "Note [id=" + id + 
			", name=" + name + 
			", description=" + description +
			", category=" + category +
			", date=" + date + "]";
}
}
