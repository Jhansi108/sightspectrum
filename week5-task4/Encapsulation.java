package task4;
class Student
{
	 private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name=name;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Student s=new Student();
		s.setName("program");
		System.out.println(s.getName());

	}

}
