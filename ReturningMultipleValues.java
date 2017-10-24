package MethodsInJava;
class MultiDiv{
	int mul;
	double div;
	MultiDiv(int m,double d){
		mul=m;
		div=d;
	}
	
}
public class ReturningMultipleValues {
	static MultiDiv getMultiDiv(int a,int b){
		return new MultiDiv(a*b ,(double)a/b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MultiDiv ans= getMultiDiv(10,20);
		System.out.println("multiplication value = "+ans.mul);
		System.out.println("multiplication value = "+ans.div);
		
       
	}

}
