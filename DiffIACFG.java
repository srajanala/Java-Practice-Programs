package AbstractClass;
abstract class Shape{
	String objectname="";
	Shape(String name){
		this.objectname=name;
	}
	public void moveTo(int x,int y){
		System.out.println(this.objectname+" has been moved to x= "+x+" y= "+y);
	}
	abstract public double area();
	abstract public void draw();
}
class Rectangle extends Shape 
{
     
    int length, width;
     
    // constructor
    Rectangle(int length, int width, String name)
    {
         
        super(name);
        this.length = length;
        this.width = width;
    }
     
    @Override
    public void draw() 
    {
        System.out.println("Rectangle has been drawn "); 
    }
     
    @Override
    public double area() 
    {
        return (double)(length*width);
    }
} 
class Circle extends Shape
{
     
    double pi = 3.14;
    int radius;
     
    //constructor
    Circle(int radius, String name)
    {
         
        super(name);
        this.radius = radius;
    }
     
    @Override
    public void draw()
    {
         
        System.out.println("Circle has been drawn "); 
    }
     
    @Override
    public double area() 
    {
        return (double)((pi*radius*radius)/2);
    }
}


public class DiffIACFG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 // creating the Object of Rectangle class
        // and using shape class reference.
        Shape rect = new Rectangle(2,3, "Rectangle");
        System.out.println("Area of rectangle: " + rect.area());
        rect.moveTo(1,2);
         
        System.out.println(" ");
         
        // creating the Objects of circle class
        Shape circle = new Circle(2, "Cicle");
        System.out.println("Area of circle: " + circle.area());
        circle.moveTo(2,4);
	}

}
