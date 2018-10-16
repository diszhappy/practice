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
/**
 * 
 * @author Saumm on 16-Oct-2018 11:38:47 PM
 * This Class is created for : 
 *
 */
public class EmployeeService {
	/**
	 * Restrict object creation of this class as the method in it will be static
	 */
	private EmployeeService() {
		
	}
	
	public static List<Employee> getEmployees(){
		List<Employee> employees = new ArrayList<>();
		Employee e1 = new Employee("Jack", "AXCDO0012P", "jack@gmail.com", "CGO", true, "Chicago", "USA", "USA");
		Employee e2 = new Employee("Elina", "AXCD1992P", "elina@gmail.com", "TNT", true, "Taronto", "USA", "USA");
		Employee e3 = new Employee("jack", "AXCDO0012P", "jack@gmail.com", "CGO", false, "Chicago", "USA", "USA");
		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		return employees;
	}

}
