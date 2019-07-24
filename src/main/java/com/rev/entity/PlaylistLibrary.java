package com.rev.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

@Entity
@Table(name="Playlist_Library")
@DynamicUpdate
public class PlaylistLibrary {
	@Id
	@Column(name="Plid")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private long id;

	@Column(name="pid",nullable = false)
	 private long pid;

	@Column(name="lid",nullable = false)
	 private long lid;

	public long getPid() {
		return pid;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	public void setPid(long pid) {
		this.pid = pid;
	}

	public long getLid() {
		return lid;
	}

	public void setLid(long lid) {
		this.lid = lid;
	}

	public PlaylistLibrary(long pid, long lid) {

		this.pid = pid;
		this.lid = lid;
	}
	public PlaylistLibrary() {

	}
	
	
}
