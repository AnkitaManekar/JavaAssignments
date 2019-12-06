/*
 Create an Employee class with members as empId (Integer), empName (String), salary (Integer), 
 phoneNumbers (List). Create a Map where empId is the key and Employee object as the value. 
 Write a program to create a Map of 5 employees (Take empId as 201, 202, 203, 204, 205) and display it.
 Now Remove employee 202, Add 2 new employees - 206 and 207, Update salary of employee 205 and 
 display the final all employee details.
  */

package Assignment6;

public class Employee {

	int empId;
	String empName;
	int salary;
	String phoneNumbers;
	
	public Employee(int empId,String empName,int salary,String phoneNumbers) {
		this.empId=empId;
		this.empName=empName;
		this.salary=salary;
		this.phoneNumbers=phoneNumbers;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getPhoneNumbers() {
		return phoneNumbers;
	}

	public void setPhoneNumbers(String phoneNumbers) {
		this.phoneNumbers = phoneNumbers;
	}
	

	public String toString() {
		return   "{" +
                "EmployeeId='" + empId + '\'' +
                ", EmployeeName='" + empName + '\''
                + ", Employeesalary='" + salary + '\''
                +", EmployeephoneNumber='" + phoneNumbers + '\''  +
                '}' + "\n";
		
	}
	
}
