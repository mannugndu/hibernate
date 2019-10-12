package com.naveen.hibernate3.main;

import java.util.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;


@Entity
@Table(name="USER_DETAILS")
public class UserDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int sr;
	private int userId;
	private String userName;
	private Date joinDate;
	@ElementCollection(fetch = FetchType.EAGER)
	@JoinTable(name="USER_ADDRESSES")
	private List<Address> address = new ArrayList<Address>();
	
	
	@Override
	public String toString() {
		return "UserDetails [sr=" + sr + ", userId=" + userId + ", userName=" + userName + ", joinDate=" + joinDate
				+ ", address=" + address + ", description=" + description + "]";
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	private String description;

	

	
	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}


	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	

}
