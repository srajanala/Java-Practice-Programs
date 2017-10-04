package AbstractClass;
abstract class Abstract_Class{
	Abstract_Class(){
		System.out.println("Abstarct class constructor is called");
	}
	abstract void funmethod();
}

class Derived_Class extends Abstract_Class{
	Derived_Class(){
		System.out.println("Derived class constructor is called");
	}
	public void funmethod(){
		System.out.println("derived funmethod() is called");
	}
} 
public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Derived_Class d=new Derived_Class();
		d.funmethod();
	}

}
