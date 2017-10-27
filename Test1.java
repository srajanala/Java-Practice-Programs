package NestedInterface;
class Test{
	interface yes{
		void show();
	}
}

class Testing implements Test.yes{
	public void show(){
		System.out.println("nested interface - interface in a class");
	}
}
public class Test1 {
   public static void main(String[] args){
	   Test.yes obj;
	   Testing t = new Testing();
	   obj=t;
	   obj.show();
   }
}
