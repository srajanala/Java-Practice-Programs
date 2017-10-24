package MethodsInJava;

public class ReturningMultipleSameValues {
	static int[] getSumSub(int a, int b){
		int[] ans=new int[2];
		ans[0]=a+b;
		ans[1]=a-b;
		return ans;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] k=getSumSub(10,20);
      System.out.println("addition value = "+k[0]);
      System.out.println("substraction value = "+k[1]);
	}

}
