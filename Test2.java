package LambdaExpressionPackage;
import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(1);
        a.add(2);
        a.add(3);
        a.add(4);
        a.add(5);
        a.add(6);
        
       a.forEach(n->System.out.println(n));
       a.forEach(n->{if(n%2==0) System.out.println(n);});
	}

}
