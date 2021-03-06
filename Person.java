package com.example.batchprocessing;

public class Person {
  private int id;
  private String lastName;
  private String firstName;

  public Person() {
  }

  public Person(int id,String firstName, String lastName) {
	  this.id = id;
    this.firstName = firstName;
    this.lastName = lastName;
  }
  

  public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  @Override
  public String toString() {
    return "id"+ id + "firstName: " + firstName + ", lastName: " + lastName;
  }

}