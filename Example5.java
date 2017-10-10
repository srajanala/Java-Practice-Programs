package Generics;
import java.util.*;
public class Example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           ArrayList<String> al = new ArrayList<String>();
           al.add("Sai");
           al.add("Sindhu");
           al.add("Rajanala");
         //  al.add(10); - throws compile time error
           
           String s0=al.get(0);
           String s1=al.get(1);
           String s2=al.get(2);
           
           System.out.println(s0+" "+s1+" "+s2);
           
	}

}
