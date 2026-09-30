package concepts;
class Student extends Object
{
	Student()
	{
		System.out.println("This is Student Class");
	}
	public String toString()
	{
		return "This is Overriding the toString() method";
	}
}
public class ObjectClass extends Object{

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println(s.toString());
		System.out.println(s.getClass());
		System.out.println(s.getClass().getName());
	}
}







