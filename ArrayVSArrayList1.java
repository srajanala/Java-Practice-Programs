package Collection;

import java.util.*;

public class ArrayVSArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr = new int[3];
      arr[0]=4;
      arr[1]=5;
      arr[2]=6;
      
      System.out.println(arr[0]);
      for(int i=0;i<arr.length;i++)
    	  System.out.print(arr[i]+" ");
           System.out.println();
      
      ArrayList<Integer> arl = new ArrayList<Integer>();
      arl.add(10);
      arl.add(11);
      arl.add(12);
      arl.add(13);
      arl.add(14);
      
      System.out.println(arl.get(0));
   
      
      for(int i=0;i<arl.size();i++)
    	  System.out.print(arl.get(i)+" ");
      System.out.println();
      
      System.out.println(arl);
      
      System.out.println(Arrays.toString(arr));
      
      
	}

}
