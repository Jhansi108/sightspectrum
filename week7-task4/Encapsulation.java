package Task4;
class Employee{
	private String id;
	public String getId() {
		return id;
		
	}
	public void setId(String id)
	{
		this.id=id;
	}
}

public class Encapsulation {

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.setId("11432");
		System.out.println("emp.getId(): "+ emp.getId());
		

	}

}
