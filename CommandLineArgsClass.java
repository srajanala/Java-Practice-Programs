package InputOutputPackage;

public class CommandLineArgsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    if(args.length>0){
    	System.out.println("the command line arguments are present: ");
    for(String val:args)	
    	System.out.println(val);
    
    }
    else
    	System.out.println("no command line arguments are present");
           
	}

}
