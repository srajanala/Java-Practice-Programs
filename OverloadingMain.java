package MethodOverloading;

public class OverloadingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        System.out.println("Hi Geek (from main)");
        OverloadingMain.main("Geek");
	}
	public static void main(String arg1){
		System.out.println("Hi "+arg1);
		OverloadingMain.main("SaiSindhu","Sweety");
	}
	public static void main(String arg1, String arg2){
		System.out.println("Hi "+arg1+", Hello "+arg2);	
	}

}
