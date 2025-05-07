
public class Removeduplicets {
	
	public static void main(String[] args) {
		String input = "Java Programming";
		String result =removeDuplicates(input);
		System.out.println("After removing duplicets(Java programming):"+ result);
		
	}
	private static String removeDuplicates(String str) {
	    StringBuilder sb = new StringBuilder();
	    
	    for (int i = 0; i < str.length(); i++) {
	        char ch = str.charAt(i);
	        if (sb.indexOf(String.valueOf(ch)) == -1) {
	            sb.append(ch);
	        }
	    }
	    return sb.toString();
	}

}









        
       
