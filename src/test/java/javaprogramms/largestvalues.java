package javaprogramms;

import java.util.Scanner;

public class largestvalues {
public static void  main (String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter first name  ");
	int a = sc.nextInt();
	System.out.println("enter second name ");
	int b = sc.nextInt();
	System.out.println("enter third name ");
	int c = sc.nextInt();
//	 logic-1
//	if (a>b && a>c) {
//System.out.println(a +"greater");
//}else if (b>a && b>c) {
//	System.out.println(b + "greater");
//}else {
//}System.out.println(c +"greater");
//	
	
	
	
	//logic-2 Ternary operator
	int num =a>b?a:b;
	num = b>c?b:c;
	System.out.println(num);
	
	
	
}}
