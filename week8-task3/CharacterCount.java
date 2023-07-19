package task3;

public class CharacterCount {

	public static void main(String[] args) {
		String name="Hi good Morning";
	     int[] freq = new int[name.length()];  
	        int i, j;  
	          
	        //Converts given string into character array  
	        char string[] = name.toCharArray();  
	          
	        for(i = 0; i <name.length(); i++) {  
	            freq[i] = 1;  
	            for(j = i+1; j <name.length(); j++) {  
	                if(string[i] == string[j]) {  
	                    freq[i]++;  
	                      
	                    //Set string[j] to 0 to avoid printing visited character  
	                    string[j] = '0';  
	                }  
	            }  
	        }  
	          
	        //Displays the each character and their corresponding frequency  
	        System.out.println("Characters and their corresponding frequencies");  
	        for(i = 0; i <freq.length; i++) {  
	            if(string[i] != ' ' && string[i] != '0')  
	                System.out.println(string[i] + "-" + freq[i]);  
	        }
	}

}	
