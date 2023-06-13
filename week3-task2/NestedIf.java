package task1;

public class NestedIf {

	public static void main(String[] args) {
		double totalmarks=382;
		char grade;
		double per=(totalmarks/500)*100;
		if(per>=80)
		{
			grade='A';
		}
		else if((per>=70)&&(per<80))
		{
			grade='B';
		}
		else if((per>=60)&&(per<70))
		{
			grade='C';
		}
		else
		{
			grade='D';
		}
		System.out.println("The percentage of the students is:"+per);
		System.out.println("\n the grade of the students is:"+grade);
	}

}
