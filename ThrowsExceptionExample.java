package BaseAndDerivedCatch;
import java.io.*;
public class ThrowsExceptionExample {
    static void fun() throws IllegalAccessException{
    	System.out.println("Inside fun");
    	throw new IllegalAccessException("demo");
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try{
        	 fun();
         }catch(IllegalAccessException e){
        	 System.out.println("Caught inside main");
         }
	}

}
