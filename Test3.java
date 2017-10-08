package FunctionalInterface;
import java.util.*;
import java.util.function.Predicate;
public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       List<String> names=Arrays.asList("Geek","GeekQuiz","g1","QA","Geek2");
       Predicate<String> p=(s)->s.startsWith("G");
       
	for(String st:names){
		if(p.test(st))
			System.out.println(st);
	      }
       }
	}
	


