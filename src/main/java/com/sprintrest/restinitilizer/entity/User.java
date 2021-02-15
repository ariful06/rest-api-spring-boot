package com.sprintrest.restinitilizer.entity;


public class User {

	private int userId;
	private String userName;
	private String passwordHash;
	private long CreatedAt;
	private boolean isActive;

	public User(){

	}

	public User(int userId, String userName, String passwordHash, boolean isActive) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.passwordHash = passwordHash;
		this.isActive = isActive;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPasswordHash() {
		return passwordHash;
	}

	public void setPasswordHash(String passwordHash) {
		this.passwordHash = passwordHash;
	}

	public long getCreatedAt() {
		return CreatedAt;
	}

	public void setCreatedAt(long createdAt) {
		CreatedAt = createdAt;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}
}
