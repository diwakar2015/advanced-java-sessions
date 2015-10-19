package collections;

import java.util.HashSet;
import java.util.Iterator;


public class HashSetExample {
	
	public static void main(String[] args) {
		
		
		HashSet<SSN> ssnSet = new HashSet<SSN>();
		
		SSN ssn1 = new SSN();
		
		ssn1.setSsnId("123-321");
		ssn1.setName("Prashant");
		ssn1.setAge(25);
		
		SSN ssn2 = new SSN();
		ssn2.setSsnId("145-321");
		ssn2.setName("Madhuri");
		ssn2.setAge(24);
		
		SSN ssn3 = new SSN();
		ssn3.setSsnId("123-321");
		ssn3.setName("Prashant");
		ssn3.setAge(25);
		
		
		ssnSet.add(ssn1); 
		ssnSet.add(ssn2);
		ssnSet.add(ssn3);
		
		
		Iterator<SSN> itr = ssnSet.iterator();
		
		while(itr.hasNext())
		{
			System.out.println("SSN: "+ itr.next());
		}
		
		
	
		
		
		System.out.println("Size of set is "+ ssnSet.size());
	
	}
	

}
