package in.diszhappy.services;

import java.util.ArrayList;
import java.util.List;

import in.diszhappy.bean.MinistryaBean;
import in.diszhappy.bean.Organisation;

public class MinistryService {
	public static MinistryaBean getMinistry() {
		
		List<Organisation> organisations = new ArrayList<>();
		organisations.add(new Organisation(1, "DST", "111111", DepartmentService.getDepartments()));
		MinistryaBean ministry = new MinistryaBean(1, "InformationScience", organisations);
		return ministry;
	}
}
