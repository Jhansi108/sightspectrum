package task3;
class programmer {
	int bonus=10000;
}
public class InheritanceProgram extends programmer {
	float salary=40000f;

	public static void main(String[] args) {
		InheritanceProgram p=new InheritanceProgram();
		System.out.println("Programmer salary is:"+p.salary);
		System.out.println("Bonus of programmer is:"+p.bonus);

	}

}
