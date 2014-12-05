package org.adho.dhconvalidator.conftool;

import java.util.Collections;
import java.util.List;

public class User {
	
	private Integer userId;
	private String userName;
	private String firstName;
	private String lastName;
	private List<Integer> paperIds;
	
	public User(Integer userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public User(Integer userId, String firstName, String lastName,
			List<Integer> paperIds) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.paperIds = paperIds;
	}

	public Integer getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public List<Integer> getPaperIds() {
		return Collections.unmodifiableList(paperIds);
	}
	
	@Override
	public String toString() {
		return "#"+userId+"["+userName+","+firstName+","+lastName+"]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
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
		User other = (User) obj;
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}
	
	
}
