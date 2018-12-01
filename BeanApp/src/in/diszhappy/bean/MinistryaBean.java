package in.diszhappy.bean;

import java.io.Serializable;
import java.util.List;

/**
 * @author Saumm created on 01-Dec-2018 11:54:33 AM 
 * Desc : This class is written to hold ministry details
 */
public class MinistryaBean implements Serializable{

	/**
	 * @author Saumm
	 */
	private static final long serialVersionUID = -7693651886172801306L;

	private long ministryId;
	private String ministryName;
	private List<Organisation> organisations;
	
	/**
	 * @author Saumm
	 * @param ministryId
	 * @param ministryName
	 * @param organisations
	 */
	public MinistryaBean(long ministryId, String ministryName, List<Organisation> organisations) {
		super();
		this.ministryId = ministryId;
		this.ministryName = ministryName;
		this.organisations = organisations;
	}
	public long getMinistryId() {
		return ministryId;
	}
	public void setMinistryId(long ministryId) {
		this.ministryId = ministryId;
	}
	public String getMinistryName() {
		return ministryName;
	}
	public void setMinistryName(String ministryName) {
		this.ministryName = ministryName;
	}
	public List<Organisation> getOrganisations() {
		return organisations;
	}
	public void setOrganisations(List<Organisation> organisations) {
		this.organisations = organisations;
	}
}
