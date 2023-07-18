package task2;

public class StringReverse {

	public static void main(String[] args) 
	{
		String str="malayalaM";
		String reverse="";
		for(int i=str.length()-1;i>=0;i--)
		{
			reverse=reverse+str.charAt(i);
		}
		
	if(str.toLowerCase().equals(reverse.toLowerCase()))
			
	{
		System.out.println(str+" : polindrom");

}
	else
		
	{
		System.out.println(str+" : not polindrom");
	}
	}
}
