package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class HashMapExample {
	
	public static void main(String[] args) {
		
		String str = "This is a just a simple count count senetence number This on which is we want to This This count them a number This This This This count of words";
		
		HashMap<String, Integer> wordCountMap = new HashMap<String, Integer>();
		
		
		
		
		StringTokenizer tokenizer = new StringTokenizer(str, " ");
		
		while(tokenizer.hasMoreTokens())
		{
			String word = tokenizer.nextToken();
			
			
			if(wordCountMap.get(word)!=null)
			{
				
				int getCount = wordCountMap.get(word);
				getCount = getCount + 1;
				wordCountMap.put(word, getCount);
				
			}
			else
			{
				wordCountMap.put(word, 1);
			}
			
			
			
		}
		
		
		
		for(Map.Entry<String, Integer> entry : wordCountMap.entrySet())
		{
			System.out.println("Word "+ entry.getKey() + " appeared "+ entry.getValue() + " times.");
			
		}
		
		
		
		
		
	}
	


}
