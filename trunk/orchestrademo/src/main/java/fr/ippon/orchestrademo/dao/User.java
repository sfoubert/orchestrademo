package fr.ippon.orchestrademo.dao;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class User
{
  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  private Long id;
  
  private String firstname;
  
  private String lastname;
  
  @Temporal(value = TemporalType.DATE) 
  private Date birthday;
  
//  OneToOne(cascade=CascadeType.ALL) 
//  private Address address;
  
  public User()
  {

  }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public String getFirstname() {
	return firstname;
}

public void setFirstname(String firstname) {
	this.firstname = firstname;
}

public String getLastname() {
	return lastname;
}

public void setLastname(String lastname) {
	this.lastname = lastname;
}

public Date getBirthday() {
	return birthday;
}

public void setBirthday(Date birthday) {
	this.birthday = birthday;
}
  
}