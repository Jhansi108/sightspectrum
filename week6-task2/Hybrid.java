package task2;
class School{
}
	class Students extends School{
		
	}
	class Childs extends School{
	
	
}

public class Hybrid extends Students{
	

	public static void main(String[] args) {
		School s=new School();
		Hybrid h=new Hybrid();
		Childs c=new Childs();
		System.out.println(s instanceof School);
		System.out.println(h instanceof Hybrid);
		System.out.println(c instanceof Childs);
		
		

	}

}
