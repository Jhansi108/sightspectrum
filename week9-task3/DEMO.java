package task3;

public class DEMO {

	public static void main(StringPro[] args) {
		try {
	         int a=10,b=30;
	         int c = b/a;
	         System.out.println(" ");
	      } catch(ArithmeticException ae){
	         System.out.println(" ");
	      } finally {
	         System.out.println("finally block is always executed");
	      }

	}

}
