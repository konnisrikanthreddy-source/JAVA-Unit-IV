package utilpackage;
import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> t=new TreeSet<Integer>();
		
		t.add(492);
		t.add(456);
		t.add(489);
		t.add(456);
		
		System.out.println(t);
		
		System.out.println(t.add(476));
		System.out.println(t);
		
		t.remove(476);
		System.out.println(t);
			
		if(t.contains(483))
		{
			System.out.println("HallTicket exits");
		}
		System.out.println("HallTicket Doesn't exits");
				
		System.out.println(t.size());
		System.out.println(t.first());
		System.out.println(t.last());
	}
}
