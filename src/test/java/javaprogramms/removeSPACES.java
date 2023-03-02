package javaprogramms;

public class removeSPACES {
public static void main(String[] args) {
	String str= "this  is  pavan";
	System.out.println("print before-----"+str);
	str=str.replaceAll("//s", "");
	System.out.println("print after------"+ str);
}
}
