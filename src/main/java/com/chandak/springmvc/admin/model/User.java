/**
 * 
 */
package com.chandak.springmvc.admin.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import com.chandak.springmvc.common.model.BaseEntity;
import com.chandak.springmvc.common.model.Domain;
import com.chandak.springmvc.common.model.DomainType;

/**
 * @author krishna
 *
 */
@Entity
// @Table(name = "USER_INFO")
@Domain(DomainType.ADMIN)
public class User extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2029344205802552120L;

	@Column(name = "firstName")
	private String firstName;

	@Column(name = "lastName")
	private String lastName;

	@Column(name = "email", unique = true, length = 200)
	private String email;

	@Column(name = "password")
	private String password;

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName
	 *            the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName
	 *            the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email
	 *            the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "User [getId()=" + getId() + ", getVersion()=" + getVersion() + ", getCreatedDate()=" + getCreatedDate()
				+ ", getUpdatedDate()=" + getUpdatedDate() + ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", getFirstName()=" + getFirstName() + ", getLastName()="
				+ getLastName() + ", getEmail()=" + getEmail() + ", getPassword()=" + getPassword() + "]";
	}

}
