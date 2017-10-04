package AbstractClass;
abstract class C{
	final void fun(){
		System.out.println("method cant be overridden");
	}
}
class D extends C{
	
}
public class AbsClassHaveFinalMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    C c=new D();
    c.fun();
	}

}
