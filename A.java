package ComparatorInterface;
import java.util.Comparator;


public class A{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  B b =new B();
  System.out.println(b.compare(new Integer(10), new Integer(20)));
	}

}


class B implements Comparator{
public int compare(Object obj1, Object obj2){
	
	Integer i1=(Integer)obj1;
	Integer i2=(Integer)obj2;
	if(i1>i2){return 1;}
	else if(i1==i2){return 0;}
	else {return -1;}
	
	
}
	
}
