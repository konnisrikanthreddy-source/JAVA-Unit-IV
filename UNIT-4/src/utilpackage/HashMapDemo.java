package utilpackage;
import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> h=new HashMap<Integer,String>();
		
		h.put(403,"Ramu");
		h.put(402, "Laxman");
		h.put(401, "Pawan");
		
		System.out.println(h);
		System.out.println(h.get(403));
		
		h.put(403, "Dharma");  // Duplicate keys not allowed.
		System.out.println(h);
		
		System.out.println(h.keySet());
		System.out.println(h.values());
	}

}
