package LambdaExpressionPackage;

interface FunctInterface{
	void abstractfun(int x);
}

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               FunctInterface f = (int x)->System.out.println(2*x);
               f.abstractfun(10);
	}

}
