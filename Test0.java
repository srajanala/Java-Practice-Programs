package Collection;

import java.io.*;
import java.util.*;

public class Test0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int[] arr =new int[]{1,2,3,4};
         Vector<Integer> v = new Vector();
         Hashtable<Integer, String> h =new Hashtable();
         v.addElement(1);
         v.addElement(2);
         h.put(1, "sai");
         h.put(2, "sai");
         System.out.println(arr[0]);
         System.out.println(arr[1]);

         System.out.println(v.elementAt(0));
         System.out.println(v.elementAt(1));

         System.out.println(h.get(1));
         System.out.println(h.get(2));
         System.out.println(h.get(3));


	}

}
