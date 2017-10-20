package Localinnerclass;

public class ScopeInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      //static class Inner{ //classes can't be static
      class Inner{
    	   public void display(){
    		   System.out.println("inside inner class");
    	   }
       }
      // Inner in=new Inner();
      // in.display();
	}
    ScopeInner out=new ScopeInner();
    Inner in=new Inner();//cant be called outside the scope
    in.display();
}
