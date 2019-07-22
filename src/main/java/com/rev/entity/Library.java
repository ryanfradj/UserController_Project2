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
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Library")
@DynamicUpdate
public class Library {
	
@Id
@Column(name="lid")
@GeneratedValue(strategy = GenerationType.IDENTITY)
 private long id;

@Column(name="title",length=50)
 private String title;

@Column(name="album",length=50)
 private String album;

 @Column(name="artist",length=50)
 private String artist;
 
 @Column(name="genre",length=50)
 private String genre;

 @OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
 @JoinTable(name="library_playlist",
 			joinColumns=@JoinColumn(name="lid"),
 			inverseJoinColumns=@JoinColumn(name="pid"))
		private List<Playlist>  playlists= new ArrayList<>();

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public String getTitle() {
	return title;
}

public void setTitle(String title) {
	this.title = title;
}

public String getAlbum() {
	return album;
}

public void setAlbum(String album) {
	this.album = album;
}

public String getArtist() {
	return artist;
}

public void setArtist(String artist) {
	this.artist = artist;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public List<Playlist> getPlaylists() {
	return playlists;
}

public void setPlaylists(List<Playlist> playlists) {
	this.playlists = playlists;
}

@Override
public String toString() {
	return "Library [id=" + id + ", title=" + title + ", album=" + album + ", artist=" + artist + ", genre=" + genre
			+ ", playlists=" + playlists + "]";
}

public Library( String title, String album, String artist, String genre, List<Playlist> playlists) {


	this.title = title;
	this.album = album;
	this.artist = artist;
	this.genre = genre;
	this.playlists = playlists;
}
public Library() {

}
 
 
}