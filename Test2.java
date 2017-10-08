package FunctionalInterface;

interface square{
	int calculate(int x);
}

public class Test2 {

	public static void main(String[] args) {
		int a=5;
		// TODO Auto-generated method stub
       square s=(int x)->x*x;
       int ans=s.calculate(a);
       System.out.println(ans);
	}

}
