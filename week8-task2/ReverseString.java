package task2;

public class ReverseString {

	public static void main(String[] args) {
		String str="jhansi";//'j''h''a''n''s'i'
		String reverse="";//isnahj
		for(int i=str.length()-1;i>=0;i--)//5,4,3,2,1,0
		{
			reverse=reverse+str.charAt(i);//i,s,n,a,h,j
		}
		System.out.println(reverse);
	}

}
