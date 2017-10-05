package Collection;
import java.util.*;

public class TreeSetExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        TreeSet t = new TreeSet();
        t.add("GeeksForGeeks");
        t.add("COmplier");
        t.add("practice");
        System.out.println(t);
        System.out.println(t.first());
        System.out.println(t.last());
        System.out.println(t.headSet("O"));
        System.out.println(t.tailSet("G"));
        System.out.println(t.subSet("C", "P"));
        t.clear();
        System.out.println(t);
	}

}
