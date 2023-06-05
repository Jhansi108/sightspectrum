package task5;

public class ExceptionHandlingProgram {

	public static void main(String[] args) throws Exception {
		try {
			int d=8;
			int a=-5;
			int c=d+a;
			System.out.println(c);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		finally {
			System.out.println("im excuted");
		}
		//System.out.println("4");
		}
	}


