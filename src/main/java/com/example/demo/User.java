package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USERS")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="ID")
    private long id;
    @Column(name="NAME")
    private  String name;
    @Column(name="EMAIL")
    private  String email;
    
    public User() {
    	
    }
    
	public User(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public User(long id, String name, String email) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
    
}
