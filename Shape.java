package Interface;


//Java program to illustrate the
//concept of interface 
import java.io.*;

interface Shape
{
 // abstract method
 void draw();
 double area();
}

class Rectangle implements Shape 
{
 int length, width;
  
 // constructor
 Rectangle(int length, int width)
 {
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

class Circle implements Shape 
{
  
 double pi = 3.14;
 int radius;
  
 //constructor
 Circle(int radius)
 {
      
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

