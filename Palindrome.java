package JavaImportantPrograms;

class Palindrome{
	public static void main(String[] args){
		int temp,r,sum=0;
		int n=151;
		temp=n;
		while(n>0){
			r = n%10;
			sum = (sum*10)+r;
			n=n/10;			
		}
		
		if(temp==sum)
			System.out.println("Given string is \"PALINDROME\"");
		else
			System.out.println("Given string is \"NOT PALINDROME\"");
		
	}
}