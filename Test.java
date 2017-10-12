package ImmutableClass;

final class Student {
	
	{
		System.out.println("Initialization Block");
	}
	final String name;
	final int regno;
	public Student(String name, int regno){
		System.out.println("Constructor");
		this.name=name;
		this.regno=regno;
	}
	public String getName(){
		return name;
	}
	public int getRegno(){
		return regno;
	}
	
}

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Student s = new Student("sai",2020);
       System.out.println("name: "+s.name);
       System.out.println("regno: "+s.regno);
       
       
       
       String s2 = "hello";
       
       String s1 = new String("hello");
       String s3 = "hello";
       System.out.println(s1 == s2);
       System.out.println(s1.equals(s2));
       
    		 
	}

}
