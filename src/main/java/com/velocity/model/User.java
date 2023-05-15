package com.velocity.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	// One user has many Orders

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String username;

	private String realName;

	private String password;

	private String gender;

	private String birthday;

	private String userType;

// create the object of Orders table
	@OneToMany(mappedBy = "userId")
	//private List<Orders> ordersList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRealName() {
		return realName;
	}

	public void setRealName(String realName) {
		this.realName = realName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getUserType() {
		return userType;
	}

	public void setUserType(String userType) {
		this.userType = userType;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", realName=" + realName + ", password=" + password
				+ ", gender=" + gender + ", birthday=" + birthday + ", userType=" + userType + "]";
	}
	
/*
	public List<Orders> getOrdersList() {
		return ordersList;
	}
	
	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}
	*/
}
