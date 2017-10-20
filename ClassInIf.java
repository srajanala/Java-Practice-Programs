package Localinnerclass;


public class ClassInIf {
	public int data=10;
	public int getData(){
		return data;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ClassInIf outer=new ClassInIf();
      if(outer.getData()<20)
      {
    	  class CInner{
    		  public int getValue()
    		  {
    			  System.out.println("inside the inner class which is in if statement");
    			  return outer.data;
    		  }
    	  }
    	  CInner Inn=new CInner();
    	  System.out.println(Inn.getValue());
      }
      else
      {
    	  System.out.println("Inside the outer class");
      }
	}

}
