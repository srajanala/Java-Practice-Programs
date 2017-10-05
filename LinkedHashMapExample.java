package Collection;
import java.util.*;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedHashMap<String,String> lhm = new LinkedHashMap();
          lhm.put("one", "Hello");
          lhm.put("two", "hi");
          lhm.put("three", "GeeksForGeeks");
          lhm.put("four", "Hello");
          System.out.println(lhm);
          System.out.println("getting value for key one: "+lhm.get("one"));
          System.out.println("size is: "+lhm.size());
          System.out.println("Is map empty: "+lhm.isEmpty());
          System.out.println("contains key two: "+lhm.containsKey("two"));
          System.out.println("contains value Hello: "+lhm.containsValue("Hello"));
          System.out.println("Delete element one: "+lhm.remove("one"));
          System.out.println(lhm);
	}

}
