package Collection;
import java.util.*;

public class TreeSetExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      TreeSet<String> t = new TreeSet<String>();
      t.add("A");
      t.add("B");
      t.add("C");
      t.add("A");
      System.out.println(t);
     // t.addAll(2);
      //throws classCastException Error at run time
	}

}
