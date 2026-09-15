package concepts;
class Student extends Object
{
	//int id;
	//String name;
	//Student(int id, String name)
	Student()
	{
		//this.id=id;
		//this.name=name;
		System.out.println("Student Class");
	}
	//public String toString()
	//{
	//	return id+" "+name;
	//}
}
public class ObjectClass extends Object{

	public static void main(String[] args) {
		//Student s=new Student(401,"Ramu");
		Student s=new Student();
		System.out.println(s.toString());
		System.out.println(s.getClass());
		System.out.println(s.getClass().getName());
	}
}
