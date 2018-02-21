package prob04;

public class StringUtil {
	public static String concatenate( String[] str ) {
		
		StringBuilder strB = new StringBuilder();
		for(int i = 0; i < str.length; i++) {
			
			 strB.append(str[i]);
			
		}
		
		return strB.toString();
		
	}
	
}
