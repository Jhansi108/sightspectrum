package task3;
interface Add{
	public void sub();
	public void div();
	
}
public class InterfaceProgram  implements Add {
public void sub() {
	System.out.println("mul");
}
public void div() {
	System.out.println("jha");
}
	public static void main(String[] args) {
		InterfaceProgram i=new InterfaceProgram();
		i.sub();
		i.div();

	}

}
