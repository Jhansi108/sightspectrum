package task1;

public class Exeception {

	public static void main(String[] args) {
		try {
			int d=100/0;
		}
		catch(ArithmeticException e){
			System.out.println(e);
		}
		System.out.println("rest of the code");
	}

}
