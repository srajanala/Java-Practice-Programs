package AbstractClass;

abstract class A{
	void fun(){
		System.out.println("fun is created");
	}
}
class B extends A{
	
}

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     B b =new B();
     b.fun();
	}

}
