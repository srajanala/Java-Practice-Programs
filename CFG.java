package Interface;


class CFG{
	public static void main(String[] args){
		Bicycle b1=new Bicycle();
		b1.changeGear(2);
		b1.speedUp(3);
		b1.applyBreaks(1);
		System.out.println("Bicycle's present state");
		b1.printstate();
		
		Bicycle b2=new Bicycle();
		b2.changeGear(1);
		b2.speedUp(4);
		b2.applyBreaks(3);
		System.out.println("Bike's present state");
		b2.printstate();
		
	}
	
}