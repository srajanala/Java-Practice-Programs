package Generics;

public class Example3 {
	static <T> void genericFunction(T element){
		System.out.println(element.getClass().getName()+" = "+element);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         genericFunction(13);
         genericFunction("GeekforGeeks");
         genericFunction(11.0);
         
	}

}
