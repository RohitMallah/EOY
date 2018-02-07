package Deloitte.Eomployees.Models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "USERINFO")
public class User {

	@Id
	@Column(name="ID")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long iD;
	

	@Column(name="USERNAME")
	private String userName;
	
	
	@Column(name="PASSWORD")
	private String password;
	

	
	@OneToOne
	@JoinColumn(name="PROFILE" , referencedColumnName = "ID")
	private EmployeeProfile profile;
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}

	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
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
	 * @return the iD
	 */
	public Long getiD() {
		return iD;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setiD(Long iD) {
		this.iD = iD;
	}

	/**
	 * @return the profile
	 */
	public EmployeeProfile getProfile() {
		return profile;
	}

	/**
	 * @param profile the profile to set
	 */
	public void setProfile(EmployeeProfile profile) {
		this.profile = profile;
	}

	/**
	 * @param userName
	 * @param password
	 * @param email
	 * @param profile
	 */
	public User(String userName, String password, EmployeeProfile profile) {
		super();
		this.userName = userName;
		this.password = password;
		this.profile = profile;
	}

	public User() {
		// TODO Auto-generated constructor stub
	}

	
	
	
}
