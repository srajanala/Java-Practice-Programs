package InputOutputPackage;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BufferReaderExample {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
     BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
     System.out.println("Enter name: ");
     String name= bfr.readLine();
     System.out.println("Given name: "+name);
	}

}
