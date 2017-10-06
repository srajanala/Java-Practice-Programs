package EnumPackage;

public class EnumTest1 {
	enum Directions{
		NORTH, SOUTH, WEST, EAST, NORTHEAST;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Directions d = Directions.NORTHEAST;
            System.out.println(d);
	}

}
