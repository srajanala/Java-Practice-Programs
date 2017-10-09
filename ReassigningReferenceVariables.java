package GarbageCollector;

public class ReassigningReferenceVariables {
    String obj_name;
   public ReassigningReferenceVariables(String obj_name){
    	this.obj_name=obj_name;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReassigningReferenceVariables t1=new ReassigningReferenceVariables("t1");
		ReassigningReferenceVariables t2=new ReassigningReferenceVariables("t2");
		t1=t2;
		System.gc();
	}
	protected void finalize() throws Throwable{
		System.out.println(this.obj_name+" succesfully garbage collected");
	}

}
