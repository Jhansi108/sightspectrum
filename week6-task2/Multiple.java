package task2;
class A{
	void msg() {
		System.out.println("hello");
	}
}
class B
{
	void msg() {
		System.out.println("friend");
	}
	
}

public class Multiple extends A,B {

	public static void main(String[] args) {
		Multiple.obj=new Multiple();
		obj.msg();
	}

}

