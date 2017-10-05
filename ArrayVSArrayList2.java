package Collection;

import java.util.*;

public class ArrayVSArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] arr = new int[3];
       arr[0]=5;
       arr[1]=6;
       arr[2]=7;
      
       
       ArrayList<Integer> arl = new ArrayList<Integer>();
       arl.add(1);
       arl.add(2);
       arl.add(3);
       arl.add(4);
       
       System.out.println(arl);
       System.out.println(Arrays.toString(arr));
       
      
       
	}

}
