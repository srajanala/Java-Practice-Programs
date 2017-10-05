package BaseAndDerivedCatch;

class Base extends Exception{}

class Derived extends Base{}

public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      try{
    	  throw new Derived();
      }catch(Derived d){
    	  System.out.println("Derived Exception is caught");
      }
      catch(Base b){
    	  System.out.println("Base Exception is caught");
      }
      
     
	}

}
