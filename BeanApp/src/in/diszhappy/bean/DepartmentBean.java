package in.diszhappy.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Saumm created on 01-Dec-2018 11:43:43 AM 
 * Desc : This class is written to hold department details
 */
public class DepartmentBean implements Serializable{

	/**
	 * @author Saumm
	 */
	private static final long serialVersionUID = -112944419447674180L;

	private long deptId;
	private String deptName;
	private String deptAddress;
	private List<EmployeeBean> beans;
	
	
	
	/**
	 * @author Saumm
	 * @param deptId
	 * @param deptName
	 * @param deptAddress
	 * @param beans
	 */
	public DepartmentBean(long deptId, String deptName, String deptAddress, List<EmployeeBean> beans) {
		super();
		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAddress = deptAddress;
		this.beans = beans;
	}
	/**
	 * @return the deptId
	 */
	public long getDeptId() {
		return deptId;
	}
	/**
	 * @param deptId the deptId to set
	 */
	public void setDeptId(long deptId) {
		this.deptId = deptId;
	}
	/**
	 * @return the deptName
	 */
	public String getDeptName() {
		return deptName;
	}
	/**
	 * @param deptName the deptName to set
	 */
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	/**
	 * @return the deptAddress
	 */
	public String getDeptAddress() {
		return deptAddress;
	}
	/**
	 * @param deptAddress the deptAddress to set
	 */
	public void setDeptAddress(String deptAddress) {
		this.deptAddress = deptAddress;
	}
	/**
	 * @return the beans
	 */
	public List<EmployeeBean> getBeans() {
		if(beans == null)
			beans = new ArrayList<>();
		return beans;
	}
	/**
	 * @param beans the beans to set
	 */
	public void setBeans(List<EmployeeBean> beans) {
		this.beans = beans;
	}
	
}
