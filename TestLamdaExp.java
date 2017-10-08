package FunctionalInterface;

public class TestLamdaExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       new Thread(()->{System.out.println("new thread is created");}).start();
	}

}
