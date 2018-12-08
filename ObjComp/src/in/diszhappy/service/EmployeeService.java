package in.diszhappy.service;
/**
 * 
 * @author Saumm on 16-Oct-2018 10:08:53 PM
 * This Class is responsible to produce employee objects 
 *
 */

import java.util.ArrayList;
import java.util.List;

import in.diszhappy.bean.Employee;

public class EmployeeService {
	
	private EmployeeService() {
		
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		
		Employee e1 = new Employee("test", "AXCDO0012P", "ss@gmail.com", "CTC", true, "Odisha", "India", "India");
		Employee e2 = new Employee("test2", "AXCD1992P", "ss@gmail.com", "NGR", true, "Odisha", "India", "India");
	Employee e3 = new Employee("test", "AXCDO0012P", "ss@gmail.com", "CTC", true, "Odisha", "India", "India");
		
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		
		return employees;
	}

}
