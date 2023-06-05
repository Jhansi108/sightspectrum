package task1;
class jhansi{
	protected void tv() {
		System.out.println("bus");
	}
	
}
public class protectedprogram  extends jhansi{
public static void main(String[] args) {
	protectedprogram pg=new protectedprogram();
	pg.tv();
}
}
