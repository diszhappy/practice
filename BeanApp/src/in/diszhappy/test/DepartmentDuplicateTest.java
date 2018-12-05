package in.diszhappy.test;

import in.diszhappy.bean.DepartmentBean;
import in.diszhappy.bean.MinistryaBean;
import in.diszhappy.bean.Organisation;
import in.diszhappy.services.MinistryService;

public class DepartmentDuplicateTest {
	public static void main(String[] args) {
		MinistryaBean ministry = MinistryService.getMinistry();
		for (Organisation organisation : ministry.getOrganisations()) {
			String prevDeptName = "";
			String newDeptName = "";
			for (DepartmentBean department : organisation.getBeans()) {
				if ("".equals(prevDeptName))
					prevDeptName = department.getDeptName();
				newDeptName = department.getDeptName();

				if (!prevDeptName.equals(newDeptName)) {
					System.out.println("Different Dept found " + prevDeptName + "\t and\t" + newDeptName);
					break;
				}

			}
		}
	}
}
