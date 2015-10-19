package collections;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreepMap {
	
	public static void main(String[] args) {
		
		TreeMap<String, Integer> treeMap = new TreeMap<String, Integer>();
		
		
        treeMap.put("flg", 5);
		treeMap.put("xyz", 5);
		treeMap.put("abc", 5);
		treeMap.put("pqr", 5);
		treeMap.put("def", 5);
		treeMap.put("mno", 5);
		
		
		 Set<Entry<String, Integer>> list  = treeMap.entrySet();
		 
		 for(Entry<String, Integer> entry : list)
		 {
			 System.out.println("Key : "+ entry.getKey() + " Value : "+ entry.getValue());
			 
		 }
		 
		 
		 
		
		
		
	}

}
