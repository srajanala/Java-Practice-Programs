package Collection;
import java.util.*;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashSet<String> h = new HashSet<String>();
     h.add("India");
     h.add("Australia");
     h.add("South Africa");
     h.add("India");
     
     System.out.println(h);
     System.out.println("List contains India or not: "+h.contains("India"));
     
     h.remove("Australia");
     System.out.println("List after removing Australia: "+h);
     
     System.out.println("Iterator Over List: ");
     Iterator<String> i = h.iterator();
     while(i.hasNext())
    	 System.out.println(i.next());
	}

}
