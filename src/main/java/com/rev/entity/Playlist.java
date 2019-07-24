package com.rev.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Playlist")
@DynamicUpdate
public class Playlist {
	

@Id
@Column(name="pid")
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;

@Column(name="name",length=50)
 private String name;
@Column(name="user_id", nullable = false)
private int uid;


public Playlist() {



}
public Playlist(String name) {
	this.name = name;
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

public void setName(String name) {
	this.name = name;
}




}