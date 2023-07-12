package Task3;
class Employee{
	void Salary() {
		System.out.println("Salary=15000");
	}
}
class Programmer extends Employee{
	void Bonus() {
		System.out.println("Bonus=20000");
	}
}

public class SingleInher {

	public static void main(String[] args) {
		Programmer p=new Programmer();
		p.Bonus();
		p.Salary();
		

	}

}
