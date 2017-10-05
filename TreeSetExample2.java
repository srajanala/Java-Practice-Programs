package Collection;
import java.util.*;

public class TreeSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet t = new TreeSet();
        
        t.add("A");
        t.add("B");
       t.add(null);
        //throws null point exception
        System.out.println(t);
	}

}
