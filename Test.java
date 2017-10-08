package FunctionalInterface;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Thread(new Runnable(){
    	   public void run(){
    		   System.out.println("new thread created");
    	   }
       }).start();
	}

}
