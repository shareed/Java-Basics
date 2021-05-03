package com.revature.models;

import java.io.Serializable;

public class Avenger implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	private int id;
	private String supName;
	private String supPower;
	private String firstName;
	private String lastName;
	private int poerLevel;
	private Home homeBase;
	
	
	public Avenger() {
		super();
	}

	//For object that already exists in the database
	public Avenger(int id, String supName, String supPower, String firstName, String lastName, int poerLevel,
			Home homeBase) {
		super();
		this.id = id;
		this.supName = supName;
		this.supPower = supPower;
		this.firstName = firstName;
		this.lastName = lastName;
		this.poerLevel = poerLevel;
		this.homeBase = homeBase;
	}
	
	
	//For saving new objects to the database
	//the database will handle creating the id so we do not need it here
	public Avenger(String supName, String supPower, String firstName, String lastName, int poerLevel, Home homeBase) {
		super();
		this.supName = supName;
		this.supPower = supPower;
		this.firstName = firstName;
		this.lastName = lastName;
		this.poerLevel = poerLevel;
		this.homeBase = homeBase;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getSupName() {
		return supName;
	}


	public void setSupName(String supName) {
		this.supName = supName;
	}


	public String getSupPower() {
		return supPower;
	}


	public void setSupPower(String supPower) {
		this.supPower = supPower;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public int getPoerLevel() {
		return poerLevel;
	}


	public void setPoerLevel(int poerLevel) {
		this.poerLevel = poerLevel;
	}


	public Home getHomeBase() {
		return homeBase;
	}


	public void setHomeBase(Home homeBase) {
		this.homeBase = homeBase;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		result = prime * result + ((homeBase == null) ? 0 : homeBase.hashCode());
		result = prime * result + id;
		result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
		result = prime * result + poerLevel;
		result = prime * result + ((supName == null) ? 0 : supName.hashCode());
		result = prime * result + ((supPower == null) ? 0 : supPower.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Avenger other = (Avenger) obj;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		if (homeBase == null) {
			if (other.homeBase != null)
				return false;
		} else if (!homeBase.equals(other.homeBase))
			return false;
		if (id != other.id)
			return false;
		if (lastName == null) {
			if (other.lastName != null)
				return false;
		} else if (!lastName.equals(other.lastName))
			return false;
		if (poerLevel != other.poerLevel)
			return false;
		if (supName == null) {
			if (other.supName != null)
				return false;
		} else if (!supName.equals(other.supName))
			return false;
		if (supPower == null) {
			if (other.supPower != null)
				return false;
		} else if (!supPower.equals(other.supPower))
			return false;
		return true;
	}


	@Override
	public String toString() {
		return "Avenger [id=" + id + ", supName=" + supName + ", supPower=" + supPower + ", firstName=" + firstName
				+ ", lastName=" + lastName + ", poerLevel=" + poerLevel + ", homeBase=" + homeBase + "]";
	}
	
	
	
	
	

}
