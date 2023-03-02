package javaprogramms;

public class reverseSTRING {
public static void main(String[] args) {
	
	String str = "abcd";
	String rev =" ";
	System.out.println("before string"   +  str);
////1.using string concanation operator
//	int len=str.length();
//for(int i=len-1;i>=0;i--) {
//	rev=rev+str.charAt(i);
//	
//}
//System.out.println("after string"   +" " +rev);
//	
	//2.using character arrays
	
//	char a[]= str.toCharArray();
//	int len=a.length;
//	for(int i=len-1;i>=0;i--) {
//	
//	rev=rev+a[i];
//	}
//	
//	
	//3.using stringbuffer class
	StringBuffer sb = new StringBuffer(str);
	System.out.println(sb.reverse());
	
	
	
	System.out.println("after string"   +" " +rev);
	
	
}
}
