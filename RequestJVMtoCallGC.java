package GarbageCollector;

public class RequestJVMtoCallGC {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		RequestJVMtoCallGC t1=new RequestJVMtoCallGC();
		RequestJVMtoCallGC t2=new RequestJVMtoCallGC();
		 t1=null;
		 System.gc();
		 t2=null;
		 Runtime.getRuntime().gc();
	}
  public void finalize() throws Throwable{
	  System.out.println("Garbage collector is called");
	  System.out.println("Object garbage collected : "+this);
  }
}
