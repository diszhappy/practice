package in.diszhappy.bean;
/**
 * 
 * @author Saumm on 16-Oct-2018 9:56:06 PM
 * This Class will be responsible for creation of Employee Object
 *
 */
public class Employee {
	private String empName;
	private String panNo;
	private String emailId;
	private String location;
	private boolean status;
	private String state;
	private String country;
	private String citizenship;
	
	public Employee() {
	}
	
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return this.empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return this.panNo;
	}
	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return this.emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the location
	 */
	public String getLocation() {
		return this.location;
	}
	/**
	 * @param location the location to set
	 */
	public void setLocation(String location) {
		this.location = location;
	}
	/**
	 * @return the status
	 */
	public boolean isStatus() {
		return this.status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(boolean status) {
		this.status = status;
	}
	/**
	 * @return the state
	 */
	public String getState() {
		return this.state;
	}
	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}
	/**
	 * @return the country
	 */
	public String getCountry() {
		return this.country;
	}
	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}
	/**
	 * @return the citizenship
	 */
	public String getCitizenship() {
		return this.citizenship;
	}
	/**
	 * @param citizenship the citizenship to set
	 */
	public void setCitizenship(String citizenship) {
		this.citizenship = citizenship;
	}
	/**
	 * @param empName
	 * @param panNo
	 * @param emailId
	 * @param location
	 * @param status
	 * @param state
	 * @param country
	 * @param citizenship
	 */
	public Employee(String empName, String panNo, String emailId, String location, boolean status, String state,
			String country, String citizenship) {
		super();
		this.empName = empName;
		this.panNo = panNo;
		this.emailId = emailId;
		this.location = location;
		this.status = status;
		this.state = state;
		this.country = country;
		this.citizenship = citizenship;
	}
	
}
