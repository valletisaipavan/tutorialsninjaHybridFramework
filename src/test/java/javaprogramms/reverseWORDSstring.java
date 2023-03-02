package javaprogramms;

public class reverseWORDSstring {
public static void main (String[] args ) {
String str = "welcome to java";	
	String[] words=str.split(" ");
	String reverseString="";
	for(String w:words) {
		String reverseword="";
		for(int i=w.length()-1;i>=0;i--) {
			reverseword =reverseword+w.charAt(i);
			
		}reverseString=reverseString+reverseword+" ";
	}
	
	System.out.println(reverseString);
	
	
}
}
