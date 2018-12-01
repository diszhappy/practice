/**
 * @authos : Saumm
 * Added on 01-Dec-2018 12:00:36 PM
 */
package in.diszhappy.services;

import java.util.ArrayList;
import java.util.List;

import in.diszhappy.bean.EmployeeBean;

/**
 * @author Saumm created on 01-Dec-2018 12:00:36 PM 
 * Desc : This class is the service class for Employee
 */
public class EmployeeService {

	public static List<EmployeeBean> getEmployees(){
		List<EmployeeBean> employees = new ArrayList<>();
		for(int i = 0; i< 10; i++)
			employees.add(new EmployeeBean(i, "Employee "+i, "Department "+i, "employee"+1+"@diszhappy.com", "EMPPAN"+i));
		return employees;
	}
}
