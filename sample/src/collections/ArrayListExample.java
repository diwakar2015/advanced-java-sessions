package collections;

import java.util.Vector;

public class ArrayListExample {
	
	
	public static void main(String[] args) {
		
		
		Vector<String> nameList = new Vector<String>();
		
		nameList.add("Parashant");
		nameList.add("Madhuri");
		nameList.add("Diwakar");
		
		
		for(String name : nameList)
		{
			
			System.out.println(name);
			
		}
		
		
		
	}
	

}


