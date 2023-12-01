package com.java.group.entity;





import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USERS_AUTHENTICATION_TBL")
public class User {
    @Id
    @GeneratedValue
    private int id;
    private String userName;
    private String password;
    private String email;
    private boolean active;
    private String roles;//ROLE_USER,ROLE_ADMIN
    private String uuid;
    

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public boolean isActive() {
		return active;
	}


	public void setActive(boolean active) {
		this.active = active;
	}


	public String getRoles() {
		return roles;
	}


	public void setRoles(String roles) {
		this.roles = roles;
	}


	public String getUuid() {
		return uuid;
	}


	public void setUuid(String uuid) {
		this.uuid = uuid;
	}


	public User() {
		super();
		// TODO Auto-generated constructor stub
	}


	public User(int id, String userName, String password, String email, boolean active, String roles, String uuid) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.active = active;
		this.roles = roles;
		this.uuid = uuid;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email + ", active="
				+ active + ", roles=" + roles + ", uuid=" + uuid + ", getId()=" + getId() + ", getUserName()="
				+ getUserName() + ", getPassword()=" + getPassword() + ", getEmail()=" + getEmail() + ", isActive()="
				+ isActive() + ", getRoles()=" + getRoles() + ", getUuid()=" + getUuid() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
	
    
    
     	
}
