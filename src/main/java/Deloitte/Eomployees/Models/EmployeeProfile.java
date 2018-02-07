package Deloitte.Eomployees.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPPROFILE")
public class EmployeeProfile {
	
	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iD;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name= "DESIG")
	private String designation;
	
	@Column(name="SL")
	private String serviceLine;
	
	@Column(name="ROLE")
	private String role;

	/**
	 * @return the iD
	 */
	public Long getiD() {
		return iD;
	}

	/**
	 * 
	 */
	public EmployeeProfile() {
		super();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the designation
	 */
	public String getDesignation() {
		return designation;
	}

	/**
	 * @param designation the designation to set
	 */
	public void setDesignation(String designation) {
		this.designation = designation;
	}

	/**
	 * @return the serviceLine
	 */
	public String getServiceLine() {
		return serviceLine;
	}

	/**
	 * @param serviceLine the serviceLine to set
	 */
	public void setServiceLine(String serviceLine) {
		this.serviceLine = serviceLine;
	}

	/**
	 * @return the role
	 */
	public String getRole() {
		return role;
	}

	/**
	 * @param role the role to set
	 */
	public void setRole(String role) {
		this.role = role;
	}



	/**
	 * @param userID
	 * @param name
	 * @param designation
	 * @param serviceLine
	 * @param role
	 */
	public EmployeeProfile(String name, String designation, String serviceLine, String role) {
		super();
		this.name = name;
		this.designation = designation;
		this.serviceLine = serviceLine;
		this.role = role;
	}



	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "EmployeeProfile [iD=" + iD + ", name=" + name + ", designation=" + designation + ", serviceLine="
				+ serviceLine + ", role=" + role + "]";
	}




}
