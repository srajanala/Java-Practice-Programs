package GarbageCollector;

public class AnonymousObject {
	String a;
    public AnonymousObject(String a){
    	this.a=a;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new AnonymousObject("t1");
		new AnonymousObject("t2");
		System.gc();
	}
    protected void finalize() throws Throwable{
    	System.out.println(this.a+" successfully garbage collected");
    }
}
