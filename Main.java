package AbstractClass;

abstract class AbstractClass {
	abstract void fun();	
}

class DerivedClass extends AbstractClass{
	public void fun(){
		System.out.println("we cannot create instance for abstract class, but we can create an reference for abstract class");
	}	
}

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			AbstractClass a=new DerivedClass();
			a.fun();
		}

}
