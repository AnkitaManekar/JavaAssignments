
/*We are given the details of marks scored by students in form of a HashMap, where name of the 
  student is the Key and marks scored is the Value. Write a program to sort the map according to the
  key values i.e the names of the students in the alphabetical(lexicographical) order.
Input : Key = Jayant, Value = 80
        Key = Anushka, Value = 80
        Key = Amit, Value = 75
        Key = Abhishek, Value = 90
        Key = Danish, Value = 40
Expected Output : Sorted Map according to Names:
         Key = Abhishek, Value = 90
         Key = Amit, Value = 75
         Key = Anushka, Value = 80
         Key = Danish, Value = 40
         Key = Jayant, Value = 80
 */

package Assignment7;

public class Student {

	String name;
	int mark;

	public Student(String name, int mark) {
		super();
		this.name = name;
		this.mark = mark;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

	public String toString() {
		return  "Key = " + name+ ", Value = " + mark + "\n" ;
		
	}
	
}
