package com.coderbd.scdb.web.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8749010190406711648L;

	@Id
	@GeneratedValue
	@Column(name = "user_id")
	private int userId;

	@Column(name = "email")
	private String email;

	@Column(name = "password")
	private String password;

	@Column(name = "name")
	private String name;

	@Column(name = "authority")
	private String authority;

	@Column(name = "enabled")
	private boolean enabled;

	@Column(name = "photo")
	private String photo;

	public User() {
	}

	public User(int userId, String email, String password, String name,
			String authority, boolean enabled) {
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.authority = authority;
		this.enabled = enabled;
	}

	public User(int userId, String email, String password, String name,
			String authority, boolean enabled, String photo) {
		this.userId = userId;
		this.email = email;
		this.password = password;
		this.name = name;
		this.authority = authority;
		this.enabled = enabled;
		this.photo = photo;
	}

	public User(String email, String password, String name, String authority,
			boolean enabled, String photo) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.authority = authority;
		this.enabled = enabled;
		this.photo = photo;
	}

	public User(String email, String password, String name, String authority,
			boolean enabled) {
		this.email = email;
		this.password = password;
		this.name = name;
		this.authority = authority;
		this.enabled = enabled;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthority() {
		return authority;
	}

	public void setAuthority(String authority) {
		this.authority = authority;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", email=" + email + ", password="
				+ password + ", name=" + name + ", authority=" + authority
				+ ", enabled=" + enabled + "]";
	}

}

/**
 * xmlns:layout="http://www.ultraq.net.nz/thymeleaf/layout"
 * layout:decorator="layouts/main">
 */
