package utilpackage;
import java.util.ArrayList;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> names=new ArrayList<String>(); //create an arraylist
		names.add("CSE");
		names.add("ECE");
		names.add("CSM");
				
		System.out.println(names.get(0));
						
		System.out.println(names);
				
		
		names.add(1,"IT"); //insert in between
		System.out.println("Inserted new "+names);
				
		
		
		names.set(3, "CSD");   //Replace 
		System.out.println("Update "+names);
				
		
		names.remove(1);  // Remove
		System.out.println("After removed "+names);
				
		names.remove("CSE");  // Remove
		System.out.println("After removed "+names);
		
		System.out.println(names.size());
				
		
		System.out.println(names.contains("ECE"));
		
		System.out.println(names.indexOf("ECE"));
		
		System.out.println(names.isEmpty());
		
		
		//names.clear();*/
	}
}
