package GarbageCollector;

public class NullifyingReferenceVariable {
    String obj_name;
    public NullifyingReferenceVariable(String obj_name){
    	this.obj_name=obj_name;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullifyingReferenceVariable t1=new NullifyingReferenceVariable("t1");
		NullifyingReferenceVariable t2=new NullifyingReferenceVariable("t2");
           t1=null;
           t2=null;
           System.gc();
	}
    protected void finalize() throws Throwable{
    	System.out.println(this.obj_name+" succesfully garbage collected");
    }
}
