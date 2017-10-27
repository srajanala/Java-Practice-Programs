package NestedInterface;
class ProtectedInter{
	interface yes{
		void show();
	}
}
class Pp implements ProtectedInter.yes{
	public void show(){
		System.out.println("nested interface");
	}
}
public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       ProtectedInter.yes obj;
       Pp p=new Pp();
       obj=p;
       obj.show();
       
	}

}
