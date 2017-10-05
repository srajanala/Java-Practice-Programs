package Collection;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
         ArrayList<Integer> arrli = new ArrayList();
         
         
         for(int i=1;i<=n;i++)
        	 arrli.add(i);
         System.out.println(arrli);
         
         Iterator li = arrli.iterator();
         boolean b = true;
         System.out.println("Displayed Using While Loop");
         while(li.hasNext()){
        	 System.out.println(li.next());
        	 if(b){
        		 li.remove();
        		 b = false;
        	 }
         }
         
         arrli.remove(3);
         System.out.println(arrli);
         
         for(int i=0;i<arrli.size();i++)
        	 System.out.print(arrli.get(i)+" ");
         System.out.println("Concurrent HashMap");
         
         ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<String, Integer>();
         
         //Adding elements to map
          
         map.put("ONE", 1);
          
         map.put("TWO", 2);
  
         map.put("THREE", 3);
          
         map.put("FOUR", 4);
          
         //Getting an Iterator from map
          
         Iterator<String> it = map.keySet().iterator();
          
         while (it.hasNext())
         {
             String key = (String) it.next();
              
             System.out.println(key+" : "+map.get(key));
              
             map.put("FIVE", 5);     //This will not be reflected in the Iterator
         }
         
         System.out.println(map);
	}

}
