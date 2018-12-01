package in.diszhappy.bean;

import java.io.Serializable;
/**
 * @author Saumm created on 01-Dec-2018 11:50:58 AM 
 * Desc : This class is created to hold organization detail
 */
import java.util.List;
public class Organisation implements Serializable{

	/**
	 * @author Saumm
	 */
	private static final long serialVersionUID = 5825977340694179905L;
	
	private long orgId;
	private String orgName;
	private String orgRegdNo;
	private List<DepartmentBean> beans;
	/**
	 * @return the orgId
	 */
	public long getOrgId() {
		return orgId;
	}
	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(long orgId) {
		this.orgId = orgId;
	}
	/**
	 * @return the orgName
	 */
	public String getOrgName() {
		return orgName;
	}
	/**
	 * @param orgName the orgName to set
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * @return the orgRegdNo
	 */
	public String getOrgRegdNo() {
		return orgRegdNo;
	}
	/**
	 * @param orgRegdNo the orgRegdNo to set
	 */
	public void setOrgRegdNo(String orgRegdNo) {
		this.orgRegdNo = orgRegdNo;
	}
	/**
	 * @return the beans
	 */
	public List<DepartmentBean> getBeans() {
		return beans;
	}
	/**
	 * @param beans the beans to set
	 */
	public void setBeans(List<DepartmentBean> beans) {
		this.beans = beans;
	}
	/**
	 * @author Saumm
	 * @param orgId
	 * @param orgName
	 * @param orgRegdNo
	 * @param beans
	 */
	public Organisation(long orgId, String orgName, String orgRegdNo, List<DepartmentBean> beans) {
		super();
		this.orgId = orgId;
		this.orgName = orgName;
		this.orgRegdNo = orgRegdNo;
		this.beans = beans;
	}
	
	
	

}
