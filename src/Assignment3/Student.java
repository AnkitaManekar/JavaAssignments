/*
 3.Create a Student class with rollNumber (Integer), studentName, percentageMarks (Float) 
 as its members. Write a program to create a list of 10 students and 
 display all students details in descending order of their percentage marks.
*/

package Assignment3;

public class Student implements Comparable<Student> {

	int rollNumber;
	String studentName;
	float percentageMarks;

	public Student(int rollNumber, String studentName, float percentageMarks) {
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.percentageMarks = percentageMarks;
	}

	@Override
	public int compareTo(Student s) {
		if (percentageMarks == s.percentageMarks)
			return 0;
		if (percentageMarks < s.percentageMarks)
			return 1;
		else
			return -1;
	}

}
