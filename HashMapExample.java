package Collection;
import java.util.*;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashMap<String,Integer> h = new HashMap<String,Integer>();
          print(h);
          h.put("vaibhav",10);
          h.put("Vaishu", 20);
          h.put("Sai", 10);  
          print(h);
          System.out.println("map size: "+h.size());
          Integer a = h.get("Sai");
          System.out.println("value for key \"Sai\" is: "+a);
          h.clear();
          print(h);
	}
	
	public static void print(Map<String,Integer> h){
		if(h.isEmpty())
			System.out.println("map is empty");
		else
			System.out.println(h);
	}

}
