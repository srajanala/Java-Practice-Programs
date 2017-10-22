package MethodOverloading;

class MethodOverloadingSum {
	public int sum(int a,int b){
		return a+b;
	}
	public int sum(int a,int b,int c){
		return a+b+c;
	}
	public double sum(double a,double b){
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadingSum m=new MethodOverloadingSum();
		System.out.println(m.sum(10, 20));
		System.out.println(m.sum(10, 20,30));
		System.out.println(m.sum(10.3, 7.7));
	}

}
