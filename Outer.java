package Localinnerclass;

public class Outer {
	
	private void getValue(){
		int sum=20;
		class Inner{
			public int divisor;
			public int remainder;
			public Inner(){
				divisor=4;
				remainder=sum%divisor;
			}
			private int getDivisor(){
				return divisor;
			}
			private int getRemainder(){
				return sum%divisor;
			}
			private int getquotient(){
				System.out.println("inside method body");
				return sum/divisor;
			}
			
		}
		Inner inner=new Inner();
		System.out.println("divisor: "+inner.getDivisor());
		System.out.println("remainder: "+inner.getRemainder());
		System.out.println("quotient: "+inner.getquotient());
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer t=new Outer();
		t.getValue();
      
	}

}
