package concepts;
class Student2 extends Object
{
	Student2()
	{
		System.out.println("Student Class");
	}
	public String toString()
	{
		return "Overriding toString() method";
	}
}
public class ObjectClass2 {

	public static void main(String[] args) {
		Student2 s=new Student2();
		System.out.println(s.toString());
		System.out.println(s.getClass());
		System.out.println(s.getClass().getName());
	}
}
