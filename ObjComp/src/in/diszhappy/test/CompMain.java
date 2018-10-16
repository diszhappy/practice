/**
 * 
 */
package in.diszhappy.test;

import java.util.List;

import in.diszhappy.bean.Employee;
import in.diszhappy.comp.GenericCompare;
import in.diszhappy.service.EmployeeService;

/**
 * @author Saumm on 16-Oct-2018 10:40:21 PM
 * This Class contains the main method to initialize the execution
 *
 */
public class CompMain {
	public static void main(String[] args) {
		List<Employee> employees = EmployeeService.getEmployees();
		try {
			System.out.println(GenericCompare.compareObjectFields(employees.get(0), employees.get(1)));
			System.out.println(GenericCompare.compareObjectFields(employees.get(0), employees.get(2)));
		} catch (IllegalArgumentException | IllegalAccessException e) {
			e.printStackTrace();
		}
	}

}
