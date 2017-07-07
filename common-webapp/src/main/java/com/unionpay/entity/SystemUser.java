package com.unionpay.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Entity
@Table(name = "t_system_user")
public class SystemUser {

	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;
	
	private Long organization_id;

	private String salt;

	private String role_ids;

	private Boolean locked;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getOrganization_id() {
		return organization_id;
	}

	public void setOrganization_id(Long organization_id) {
		this.organization_id = organization_id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username == null ? null : username.trim();
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password == null ? null : password.trim();
	}

	public String getSalt() {
		return salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	public String getRole_ids() {
		return role_ids;
	}

	public void setRole_ids(String role_ids) {
		this.role_ids = role_ids;
	}

	public Boolean getLocked() {
		return locked;
	}

	public void setLocked(Boolean locked) {
		this.locked = locked;
	}

}
