package BaseAndDerivedCatch;
import java.io.*;
public class CheckedExample{

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
       FileReader file= new FileReader("C:\\test\\a.txt");
       BufferedReader fileInput=new BufferedReader(file);
       for(int counter=0;counter<3;counter++)
    	   System.out.println(fileInput.readLine());
       fileInput.close();
	}

}
