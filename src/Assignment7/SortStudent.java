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

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import org.omg.CORBA.PUBLIC_MEMBER;

public class SortStudent {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Map<String, Student> map1= new HashMap<String, Student>();
		map1.put("Jayant",new Student("Jayant", 80));
		map1.put("Anushka",new Student("Anushka", 80));
		map1.put("Amit",new Student("Amit", 75));
		map1.put("Abhishek",new Student("Abhishek", 90));
		map1.put("Danish",new Student("Danish", 40));
		System.out.println("Before Sorting: \n");
		System.out.println(map1);
		
		System.out.println("-------------------------------------------------------------");
		
		TreeMap<String, Student> map2= new TreeMap<String, Student>();
		map2.put("Jayant",new Student("Jayant", 80));
		map2.put("Anushka",new Student("Anushka", 80));
		map2.put("Amit",new Student("Amit", 75));
		map2.put("Abhishek",new Student("Abhishek", 90));
		map2.put("Danish",new Student("Danish", 40));
		System.out.println("After Sorting: \n");
		System.out.println(map2);
		
		
	}

}
