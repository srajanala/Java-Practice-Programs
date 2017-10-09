package GarbageCollector;

public class ObjectsCreatedInsideMethod {
 String a;
	public ObjectsCreatedInsideMethod(String a){
	this.a=a;	
	}
	static void show(){
		ObjectsCreatedInsideMethod t1=new ObjectsCreatedInsideMethod("t1");
		display();
	}
	static void display(){
		ObjectsCreatedInsideMethod t2=new ObjectsCreatedInsideMethod("t2");
		ObjectsCreatedInsideMethod t3=new ObjectsCreatedInsideMethod("t3");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      show();
      System.gc();
	}
    protected void finalize() throws Throwable{
    	System.out.println(this.a+" successfully collected garbage");
    }
}
