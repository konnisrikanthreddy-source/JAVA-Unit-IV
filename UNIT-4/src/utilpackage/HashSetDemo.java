package utilpackage;
import java.util.HashSet;
public class HashSetDemo {

	public static void main(String[] args) {
		HashSet<String> names=new HashSet<String>();
		
		names.add("ECE");
		names.add("CSE");
		names.add("EEE");
		
		System.out.println(names);
		
		names.add("CSE");
		System.out.println(names);
					
		System.out.println(names.add("CSM"));
		System.out.println(names);
		
		System.out.println(names.size());
		
	}
}
