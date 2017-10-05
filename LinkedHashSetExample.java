package Collection;
import java.util.*;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        LinkedHashSet<String> lset = new LinkedHashSet<String>();
        lset.add("A");
        lset.add("B");
        lset.add("C");
        lset.add("D");
        
        lset.add("A");
        lset.add("E");
        
        System.out.println("Size of linkedhashset: "+lset.size());
        System.out.println("Original LinkedHashSet: "+lset);
        System.out.println("Remove D from linkedhashset: "+lset.remove("D"));
        System.out.println("Trying to remove Z which is not present in linkedhashset: "+lset.remove("Z"));
        System.out.println("Check whether it contains A or not: "+lset.contains("A"));
        System.out.println("Updated Linked Hash Set: "+lset);
	}

}
