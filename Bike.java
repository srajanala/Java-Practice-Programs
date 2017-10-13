package Interface;

class Bike implements Vehicle{
	int speed;
	int gear;
	public void changeGear(int newgear){
		gear=newgear;
	}
    public void speedUp(int increment){
		speed=speed+increment;
	}
    public void applyBreaks(int decrement){
		speed=speed-decrement;
	}
    public void printstate(){
    	System.out.println("speed: "+ speed+"gear: "+gear);
    }
}