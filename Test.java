package LambdaExpressionPackage;

interface FuncInterface{
	void abstractfun();
}
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FuncInterface fobj = ()->System.out.println("Hello");
      fobj.abstractfun();
	}

}
