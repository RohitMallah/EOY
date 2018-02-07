package Deloitte.Eomployees.Business;

import javax.validation.constraints.NotNull;

public class SignUpForm {

	@NotNull
	private String empName;
	@NotNull
	private String emplNo;
	@NotNull
	private String password;
	@NotNull
	private String designation;
	@NotNull
	private String sL;
	@NotNull
	private String role;
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the emplNo
	 */
	public String getEmplNo() {
		return emplNo;
	}
	/**
	 * @param emplNo the emplNo to set
	 */
	public void setEmplNo(String emplNo) {
		this.emplNo = emplNo;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
	 * @return the sL
	 */
	public String getsL() {
		return sL;
	}
	/**
	 * @param sL the sL to set
	 */
	public void setsL(String sL) {
		this.sL = sL;
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
	 * @param empName
	 * @param emplNo
	 * @param password
	 * @param designation
	 * @param email
	 * @param sL
	 * @param role
	 */
	public SignUpForm(String empName, String emplNo, String password, String designation, String sL,
			String role) {
		super();
		this.empName = empName;
		this.emplNo = emplNo;
		this.password = password;
		this.designation = designation;
		this.sL = sL;
		this.role = role;
	}
	
	
	
	/**
	 * 
	 */
	public SignUpForm() {
		super();
	}
	
	
	
}
