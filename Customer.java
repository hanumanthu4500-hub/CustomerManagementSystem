/*1. Create the Customer Entity Class Create a class named Customer.
 *  The class must contain the following: 
 *  1. Four private instance variables: id, firstname, lastname, and gender. 
 *  2. A no-argument constructor. 
 *  3. A parameterized constructor that initializes all four properties. 
 *  4. Getter and setter methods for all properties. 
 *  5. An overridden equals(Object obj) method to compare two customer objects based on all four properties. 
 *  6. An overridden toString() method to return the customer details in a readable format. 
 *  Expected object representation: Customer[id=101, firstname=Rahul, lastname=Sharma, gender=M] 
 *  id int 
 *  firstName String 
 *  lastName String 
 *  gender char
 */

package com.java.weeklytasks.cms;

import java.util.Objects;

public class Customer {
	
	private int id;
	private String firstName;
	private String lastName;
	private char gender;
	
	public Customer()
	{
	}

	public Customer(int id, String firstName, String lastName, char gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public int hashCode() {
		return Objects.hash(firstName, Character.valueOf(gender), Integer.valueOf(id), lastName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		return Objects.equals(firstName, other.firstName) 
				&& gender == other.gender 
				&& id == other.id
				&& Objects.equals(lastName, other.lastName);
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstname=" + firstName + ", lastname=" + lastName + ", gender=" + gender
				+ "]";
	}
	
}
