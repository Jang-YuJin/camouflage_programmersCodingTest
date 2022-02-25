package 위장;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Solution {
    public int solution(String[][] clothes) {
    	Map<String, Integer> cloth = new HashMap<>();
    	String[] kind = new String[clothes.length];
    	
    	for(int i = 0; i < clothes.length; i++) {
    		kind[i] = clothes[i][1];
    		cloth.put(clothes[i][1], null);
    	}
    	
    	Set<String> keySet = cloth.keySet();
    	Iterator<String> iterator = keySet.iterator();
    	
    	while(iterator.hasNext()) {
    		int q = 0;
    		String str = iterator.next();
    		for(int i = 0; i < kind.length; i++) {
    			if(str.equals(kind[i])) {
    				cloth.put(str, ++q);
    			}
    		}
    	}
    	
    	int answer = 1;
    	
    	iterator = keySet.iterator();
    	while(iterator.hasNext()) {
    		answer *= cloth.get(iterator.next()) + 1;
    	}
    	
//    	System.out.println(cloth.keySet());
//    	System.out.println(cloth.get("eyewear"));
//    	System.out.println(cloth.get("headgear"));
//    	System.out.println(cloth.get("face"));
//    	System.out.println();

        return answer - 1;
    }
}
