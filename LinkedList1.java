package Collection;
import java.util.*;

public class LinkedList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	LinkedList<String> obj = new LinkedList<String>();
	obj.add("A");
	obj.add("B");
	obj.addFirst("D");
	obj.addLast("A");
	obj.add(2,"Y");
	obj.add("X");
	obj.add("F");
	obj.add("G");
	System.out.println("Linked List"+obj);
	
	
	obj.remove("A");
	obj.removeLast();
	obj.removeFirst();
	obj.remove(3);
	
	System.out.println("Deleted Linked List: "+obj);
	
	boolean status = obj.contains("B");
	if(status)
		System.out.println("Contains B alphabet");
	else
		System.out.println("B alphabet is absent");
	
	int size=obj.size();
	System.out.println("Size of Linked List is "+size);
	
	Object element = obj.get(2);
	System.out.println(element);
	
	obj.set(2,"T");
	System.out.println(obj);
	
	
        
	}

}
