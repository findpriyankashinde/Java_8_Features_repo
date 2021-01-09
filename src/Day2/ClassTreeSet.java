package Day2;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class ClassTreeSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TreeSet<String> t = new TreeSet<String>();
		t.add("mango");
		t.add("banana");
		t.add("apple");
		t.add("guava");
		
		System.out.println(t);
		System.out.println("Reverse Set " + t.descendingSet());
	//	System.out.println(t.subSet("mango", "apple"));
		System.out.println(t.contains("mango"));
		System.out.println(t.headSet("banana"));
		System.out.println(t.size());
		System.out.println(t.remove("apple"));
		
		Iterator<String> it = t.iterator();
		System.out.println("Using Iterator");
		while(it.hasNext())
		{
			System.out.println(it.next());
		//	System.out.print(",");
		}
		
		System.out.println("Using For Each Loop");
		t.forEach(f->System.out.println(f));
	}
		public class ClassCompare implements Comparator<String>
		{
		public int compare(String t1, String t2)
		{
			int s = t1.compareTo(t2);
			if(s>0)
				return -1;
			else if(s<0)
				return 1;
			else
				return 0;
			}
	}

}
