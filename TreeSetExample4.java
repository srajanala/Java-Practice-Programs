package Collection;
import java.util.*;

public class TreeSetExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList al = new ArrayList();
     al.add("A");
     al.add("B");
     al.add("C");
     System.out.println("Array List: "+al);
     TreeSet t = new TreeSet(al);
     System.out.println("Tree Set: "+t);
	}

}
