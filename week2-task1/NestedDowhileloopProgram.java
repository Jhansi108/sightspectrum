package task1;

public class NestedDowhileloopProgram {

	public static void main(String[] args) {
		int r=1;
		do {
			int c=1;
			do {
				System.out.print("*");
				c++;
				
			}while(c<=r);
			System.out.println("");
			r++;
		}while(r<=4);
	}

}
