package Generics;
import java.util.*;

public class Example4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList al=new ArrayList();
         al.add("sai");
         al.add("sindhu");
         al.add(10);
         
         String s0=(String)al.get(0);
         String s1=(String)al.get(1);
         String s2=(String)al.get(2);
         System.out.println(s0);
         System.out.println(s1);
         System.out.println(s2);
	}

}
