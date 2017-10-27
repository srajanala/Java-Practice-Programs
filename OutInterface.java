package NestedInterface;

public interface OutInterface {
	interface InnInterface{
//protected interface InnInterface{
	void show();
}
}
 class Testingg implements OutInterface.InnInterface{
	 public void show(){
		 System.out.println("Interface in a Interface");
	 }
 }