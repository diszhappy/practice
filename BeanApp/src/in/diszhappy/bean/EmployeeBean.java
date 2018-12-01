package in.diszhappy.bean;

import java.io.Serializable;
/**
 * @author Saumm created on 01-Dec-2018 11:42:12 AM 
 * Desc : This class is the bean class for Employee which will be responsible to hold one employee details.
 */
public class EmployeeBean implements Serializable {

	/**
	 * @author Saumm
	 */
	private static final long serialVersionUID = 4086566772832155329L;
	private long empId;
	private String Name;
	private String dept;
	private String emailId;
	private String panNo;
	
	/**
	 * @author Saumm
	 * @param empId
	 * @param name
	 * @param dept
	 * @param emailId
	 * @param panNo
	 */
	public EmployeeBean(long empId, String name, String dept, String emailId, String panNo) {
		super();
		this.empId = empId;
		Name = name;
		this.dept = dept;
		this.emailId = emailId;
		this.panNo = panNo;
	}
	
	/**
	 * @return the empId
	 */
	public Long getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return Name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		Name = name;
	}
	/**
	 * @return the dept
	 */
	public String getDept() {
		return dept;
	}
	/**
	 * @param dept the dept to set
	 */
	public void setDept(String dept) {
		this.dept = dept;
	}
	/**
	 * @return the emailId
	 */
	public String getEmailId() {
		return emailId;
	}
	/**
	 * @param emailId the emailId to set
	 */
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	/**
	 * @return the panNo
	 */
	public String getPanNo() {
		return panNo;
	}
	/**
	 * @param panNo the panNo to set
	 */
	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}
	
	

}
