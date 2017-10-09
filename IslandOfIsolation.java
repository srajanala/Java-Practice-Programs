package GarbageCollector;

public class IslandOfIsolation {
IslandOfIsolation i;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IslandOfIsolation t1=new IslandOfIsolation();
		IslandOfIsolation t2=new IslandOfIsolation();
		t1.i=t2;
		t2.i=t1;
		t1=null;
		t2=null;
		System.gc();
	}
    protected void finalize() throws Throwable{
    	System.out.println("Finalize method called");
    }
}
