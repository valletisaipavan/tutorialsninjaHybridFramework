package javaprogramms;
//5*4*3*2*1
public class factorial {
public static void main(String[] args) {
	 int num =5;
	int  factorial=1;
	for(int i=num;i>=1;i--) {
		 factorial = factorial * i;
		}
		System.out.println( "factorial number is-"+ factorial );
	
	
	
	
}
}
