package Day2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MyCollectionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		List<String> list = new ArrayList<String>();
		list.add("abc");
		list.add("xyz");
		
		System.out.println("Created ArrayList is"); 
        for (String x : list) 
            System.out.println(x);
        
		Set<String> set = new HashSet<String>();
		set.addAll(list);
		
		System.out.println("Created HashSet is"); 
        for (String x : set) 
            System.out.println(x);
	}

}
