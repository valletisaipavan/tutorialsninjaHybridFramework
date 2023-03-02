package javaprogramms;

public class swapingnumbers {
public static void main (String[] args) {
	int a=10 ,b=30;
	System.out.println("before swapping value" +a+ " " + b);
	
	
//	1.using another varible t
//	    int t=a;
//			a=b;
//			b=t;
//			System.out.println("after swapping value." +a+" "+ b);
//		2.using multiple and divider
//			
//			 a=a*b;
//			a=a/b;
//			b=a/b;
//			//3. using add and subtract
//			a=a+b;
//			a=a-b;
//			b=a-b;
			
			//4.using single logic
			a=a+b-(a=b);
			System.out.println("after swapping value." +a+" "+ b);
}}
	