package InputOutputPackage;
import java.util.Scanner;

public class ScannerExamplea {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name: ");
      String name=sc.nextLine();
      
      System.out.println("Enter Age: ");
      int age = sc.nextInt();
      
      System.out.println("Enter gender: ");
      char gender=sc.next().charAt(0);
      
      System.out.println("Print name: "+name);
      System.out.println("Print Age: "+age);
      System.out.println("Print Gender: "+gender);
      
	}

}
