package InputOutputPackage;
import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter name:");  
      String name = sc.nextLine();
      
      System.out.println("Enter gender:");
      char gender = sc.next().charAt(0);
      
      System.out.println("Enter Age:");
      int age = sc.nextInt();
      
      System.out.println("Enter MobileNo:");
      long mobile = sc.nextLong();
      
      System.out.println("Enter CGPA:");
      double cgpa=sc.nextDouble();
      
      System.out.println("Details dispalyed below");
      System.out.println("Name: "+name);
      System.out.println("Gender: "+gender);
      System.out.println("Age: "+age);
      System.out.println("Mobile: "+mobile);
      System.out.println("CGPA: "+cgpa);
	}
	

}
