/*4.Create an list of 10 employee names (String). Add few duplicate names into it. 
 * Remove duplicates from list without using collections. 
 * Display list before and after removal of duplicate names.*/

package Assignment4;

import java.util.ArrayList;
public class RemoveDuplicateName {

	public static void main(String[] args) {
				
		ArrayList<String> l1=new ArrayList<String>();
		l1.add("Amit");
		l1.add("Neha");
		l1.add("Neha");
		l1.add("Sumit");
		l1.add("Neha");
		l1.add("Aditya");
		l1.add("Sumit");
		l1.add("Rohit");
		l1.add("sham");
		l1.add("Amit");
		l1.add("Sumit");
		l1.add("Aditya");
		l1.add("Rohit");
		l1.add("Sham");
		
		
		System.out.println("Before removing duplicate: ");
		for(String name :l1)
		{
			System.out.println(name);	
		}
		
		int len1 =l1.size()-1;
		for(int i=0;i<=len1;i++)
		{
			for(int j=1;j<len1;j++)
			{
			if(l1.get(i).contentEquals(l1.get(j)))
					{
					l1.remove(j);
					len1--;
					}
			}
		}
			
		System.out.println("After removing duplicate:");
		for(String name1 :l1)
		{
			System.out.println(name1);	
		}
	}
}

