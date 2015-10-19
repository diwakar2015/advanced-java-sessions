package collections;

import java.util.ArrayList;
import java.util.Collections;


public class UtilityMethods {
	
	
	public static void main(String[] args) {
		
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("xbc");
		list.add("abc");
		list.add("mon");
		
		for(String s : list)
		{
			System.out.println(s);
		}
		
		System.out.println("sorting.....\n\n");
		Collections.sort(list);
		
		
		for(String s : list)
		{
			System.out.println(s);
		}
		
		
		
		
		
		
	}

}
