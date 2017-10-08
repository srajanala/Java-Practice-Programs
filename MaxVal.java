package Examples;

public class MaxVal {

	int empId ;
	String name;
	
	MaxVal(int empId, String name){
		this.empId =empId;
		this.name = name;
	}
	
	public String toString(){
		System.out.println("Inside toString Method ");
		return name+": "+empId;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a =new int[]{1,2,3,4,5,9,8,7,6};
         System.out.println(max(a)); 
	}
	public static int max(int[] t){
		MaxVal max = new MaxVal(10,"Sindhu");
		MaxVal max1 = new MaxVal(100,"Sai");
		System.out.println(max);
		System.out.println(max1);
		int maximum = t[0];   // start with the first value
	    for (int i=1; i<t.length; i++) {
	        if (t[i] > maximum) {
	            maximum = t[i];   // new maximum
	}}
	    return maximum;
	}
}

