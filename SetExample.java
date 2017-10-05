package Collection;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Set<String> hash_set = new HashSet<String>();
      hash_set.add("Geeks");
      hash_set.add("For");
      hash_set.add("Geeks");
      hash_set.add("Example");
      hash_set.add("Set");
      
      System.out.println("Set doesnot allow any duplicate values with unexpected order: "+hash_set);
      
      Set<String> t_set = new TreeSet<String>(hash_set);
      System.out.println("Tree set has sorted ordered collection of objects: "+t_set);
	}

}
