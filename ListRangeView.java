package Collection;
import java.util.*;
public class ListRangeView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          List l = new ArrayList();
          l.add("GeeksforGeeks");
          l.add("Practice");
          l.add("GeeksQuiz");
          l.add("IDE");
          l.add("Courses");
          
          List range = new ArrayList();
          range = l.subList(2,4);
          System.out.println(range);
	}

}
