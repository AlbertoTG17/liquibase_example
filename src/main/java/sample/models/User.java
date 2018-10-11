package sample.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class User {
	
	@Id
	private String name;
	
	@Column
	@NotNull
	private String lastName;
	
	@Column
	@NotNull
	private String lastName3;
	
	public User() {}

	public String getLastName3() {
		return lastName3;
	}

	public void setLastName3(String lastName3) {
		this.lastName3 = lastName3;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	

}
