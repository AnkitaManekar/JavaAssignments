/*
 Create an Employee class with members as empId (Integer), empName (String), salary (Integer), 
 phoneNumbers (List). Create a Map where empId is the key and Employee object as the value. 
 Write a program to create a Map of 5 employees (Take empId as 201, 202, 203, 204, 205) and display it.
 Now Remove employee 202, Add 2 new employees - 206 and 207, Update salary of employee 205 and 
 display the final all employee details.
  */

package Assignment6;

import java.util.HashMap;
import java.util.Map;

public class ArrangeEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		map.put(201, new Employee(201, "Ram", 50000, "9890786507"));
		map.put(202, new Employee(202, "Sham", 20000, "9890786560"));
		map.put(203, new Employee(203, "Rahul", 40000, "9889786507"));
		map.put(204, new Employee(204, "Raj", 30000, "9890747560"));
		map.put(205, new Employee(205, "ketan", 45000, "9890456560"));

		System.out.println("Diplay details of 5 employees: \n" + map);
		System.out.println("-------------------------------------------------------------------------------");
		
		map.remove(202);
		System.out.println("Removing employee 202 : \n ");
		System.out.println(map);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		map.put(206, new Employee(206, "Ramesh", 22000, "9890476560"));
		map.put(207, new Employee(207, "Suresh", 25000, "9890476560"));
		System.out.println("Adding two employees 206 and 207: \n ");
		System.out.println(map);

		System.out.println("-------------------------------------------------------------------------------");
	
		Employee e1=map.get(205);
		e1.setSalary(75000);
		map.put(205, e1);
		System.out.println("Update salary of employee 205:");
		System.out.println(map);
				
		
	}
}
