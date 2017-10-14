package Iterators_Collection_Package;

import java.util.*;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList al = new ArrayList();
        for(int i=0;i<10;i++)
        	al.add(i);
        System.out.println(al);
        	ListIterator itr = al.listIterator();
        	 while(itr.hasNext()){
        		 int i = (Integer)itr.next();
        		 System.out.print(i+" ");
        		 
        		 if(i%2==0){
        			 i++;
        	         itr.set(i);
        	         itr.add(i);
        	         }
        	 }
        	 System.out.println();
        	 System.out.println(al);
	}

}
