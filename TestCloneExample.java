package MarkerInterface;
class A implements Cloneable{
	int i;
	String S;
	public A(int i,String S){
		this.i=i;
		this.S=S;
	}
		protected Object clone() 
				throws CloneNotSupportedException{
			return super.clone();
		}	
}

public class TestCloneExample {

	public static void main(String[] args) throws CloneNotSupportedException  {
		// TODO Auto-generated method stub
       A a=new A(1,"Sai");
       A b=(A)a.clone();
       System.out.println(b.i);
       System.out.println(b.S);
	}

}
