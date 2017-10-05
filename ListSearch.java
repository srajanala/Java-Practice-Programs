package Collection;

import java.util.*;

public class ListSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      List<String> l = new ArrayList<String>(5);
      l.add("Geeks");
      l.add("for");
      l.add("Geeks");
      
      System.out.println("First Occurence: "+l.indexOf("Geeks"));
      System.out.println("Last Occurence: "+l.lastIndexOf("Geeks"));
      System.out.println("Not Present: "+l.indexOf("Hi"));
	}

}
