package Task4;
class Name{
	private int age;
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
}

public class Encap {

	public static void main(String[] args) {
		Name n=new Name();
		n.setAge(21);
		System.out.println("The age of the person is: " + n.getAge());
		

	}

}
