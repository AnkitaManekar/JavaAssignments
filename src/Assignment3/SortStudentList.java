package Assignment3;

import java.util.ArrayList;
import java.util.Collections;

public class SortStudentList {

	public static void main(String args[]){
	ArrayList<Student> list= new ArrayList<Student>();
		list.add(new Student(1, "Sham", 79));
		list.add(new Student(8, "Ram", 80));
		list.add(new Student(7, "Rakesh", 67));
		list.add(new Student(5, "Ketan", 98));
		list.add(new Student(4, "Rohit",59));
		list.add(new Student(2, "Raj", 69));
		list.add(new Student(3, "Akash", 78));
		list.add(new Student(9, "Rahul", 90));
		list.add(new Student(6, "Pritam", 99));
		list.add(new Student(10, "Vishal", 50));
		
		for(Student stlist: list) {
			System.out.println(stlist.percentageMarks);
		}
		
		System.out.println("--------------------------------");
		
		Collections.sort(list);
		
		for(Student stlist: list) {
			System.out.println( stlist.rollNumber  +" "+ stlist.studentName +" " + stlist.percentageMarks);
		}
		
		//to string()
}
}
