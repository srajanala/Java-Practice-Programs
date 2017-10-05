package Collection;
import java.util.*;
public class TreeMapExample {
	static void printFreq(int arr[]){
		TreeMap<Integer,Integer> tmap = new TreeMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++)
        {
            Integer c = tmap.get(arr[i]);
 
            // If this is first occurrence of element   
            if (tmap.get(arr[i]) == null)
               tmap.put(arr[i], 1);
 
            // If elements already exists in hash map
            else
              tmap.put(arr[i], ++c);
        }
 
        // Print result
        for (Map.Entry m:tmap.entrySet())
          System.out.println("Frequency of " + m.getKey() + 
                             " is " + m.getValue());
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[] = {10,34,5,10,3,5,10};
      printFreq(arr);
	}

}
