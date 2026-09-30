package utilpackage;
import java.util.LinkedList;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList<String> names=new LinkedList<String>();
		
		names.add("CSE");
		names.add("ECE");
		names.add("MECH");
		System.out.println(names);
		
		names.add(1,"EEE");   //insert
		System.out.println(names);
		
		names.addFirst("CSM");
		System.out.println(names);
		
		names.addLast("CSD");
		System.out.println(names);
		
		System.out.println(names.get(1));
		System.out.println(names.getFirst());
		System.out.println(names.getLast());
		
		names.set(2, "MECH");   //replace
		System.out.println(names);
		
		names.remove(2);
		System.out.println(names);
		
		names.add("CSE");
		System.out.println(names);
		//Linked List allows duplicate elements
	}
}
