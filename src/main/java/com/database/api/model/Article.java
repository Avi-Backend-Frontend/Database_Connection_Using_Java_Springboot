package com.database.api.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "article1")
public class Article {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	
	private int art_id;
	private String art_name;
	private String art_writers;
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Article(int art_id, String art_name, String art_writers) {
		super();
		this.art_id = art_id;
		this.art_name = art_name;
		this.art_writers = art_writers;
	}
	@Override
	public String toString() {
		return "Article [art_id=" + art_id + ", art_name=" + art_name + ", art_writers=" + art_writers + "]";
	}
	public int getArt_id() {
		return art_id;
	}
	public void setArt_id(int art_id) {
		this.art_id = art_id;
	}
	public String getArt_name() {
		return art_name;
	}
	public void setArt_name(String art_name) {
		this.art_name = art_name;
	}
	public String getArt_writers() {
		return art_writers;
	}
	public void setArt_writers(String art_writers) {
		this.art_writers = art_writers;
	}
	
	
}
