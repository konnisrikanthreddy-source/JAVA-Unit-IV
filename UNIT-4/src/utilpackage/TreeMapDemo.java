package utilpackage;
import java.util.TreeMap;
public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String> t=new TreeMap<Integer,String>();
		t.put(403,"Dharma");
		t.put(402, "Laxman");
		t.put(401, "Pawan");
		
		System.out.println(t);
		System.out.println(t.get(401));
				 
		t.put(403, "Arjun");  // Duplicate keys not allowed.
		System.out.println(t);
		 
		System.out.println(t.size());
		
		System.out.println(t.firstKey());
		System.out.println(t.lastKey());
		System.out.println(t.firstEntry());
	}
}
