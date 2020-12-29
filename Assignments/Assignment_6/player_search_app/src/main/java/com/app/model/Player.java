package com.app.model;

import java.util.Date;

public class Player {

	private int id;
	private String name;
	private int teamId;
	private Date dob;
	
	public Player() {
		// TODO Auto-generated constructor stub
	}

	public Player(int id, String name, int teamId, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.teamId = teamId;
		this.dob = dob;
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

	public int getTeamId() {
		return teamId;
	}

	public void setTeamId(int teamId) {
		this.teamId = teamId;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}

	@Override
	public String toString() {
		return "Player [id=" + id + ", name=" + name + ", teamId=" + teamId + ", dob=" + dob + "]";
	}
	
	
}
