package Deloitte.Eomployees.Business;

import javax.validation.constraints.NotNull;

public class SignInForm {

	@NotNull
	private String empNo;
	@NotNull
	private String password;
	/**
	 * @return the empNo
	 */
	public String getEmpNo() {
		return empNo;
	}
	/**
	 * @param empNo the empNo to set
	 */
	public void setEmpNo(String empNo) {
		this.empNo = empNo;
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
	 * @param empNo
	 * @param password
	 */
	public SignInForm(String empNo, String password) {
		super();
		this.empNo = empNo;
		this.password = password;
	}
	public SignInForm() {
		// TODO Auto-generated constructor stub
	}
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SignIn [empNo=" + empNo + ", password=" + password + "]";
	}
	
	
	
}
