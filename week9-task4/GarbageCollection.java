package task4;

public class GarbageCollection {
	public void finalize() {
		System.out.println("object garbage collected");
	}

	public static void main(String[] args) {
		GarbageCollection g1=new GarbageCollection();
		GarbageCollection g2=new GarbageCollection();
		g1=null;
		g2=null;
		System.gc();

	}

}
