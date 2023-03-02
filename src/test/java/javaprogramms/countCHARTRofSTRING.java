package javaprogramms;

public class countCHARTRofSTRING {

	public static void main(String[] args) {
		String a="java programaaaming";
		int len = a.length();
	int leng= a.replaceAll("a", "").length();
	int count = len-leng;
	System.out.println("total a -----"+count);

	}

}
