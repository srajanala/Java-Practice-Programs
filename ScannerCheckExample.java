package InputOutputPackage;
import java.util.Scanner;

public class ScannerCheckExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count=0;
        while(sc.hasNextInt()){
        	int num = sc.nextInt();
        	sum+=num;
        	count++;
        }
        double mean = sum/count;
        System.out.println("Mean: "+mean);
	}

}
