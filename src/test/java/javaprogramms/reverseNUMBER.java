package javaprogramms;

import java.util.Scanner;

public class reverseNUMBER {
public  static void main (String[] args) {
   
	//without giving n=values (num)
	
	
//	Scanner sc = new Scanner(System.in);
//	System.out.println("enter the number");
//	int num = sc.nextInt();
//	 
	
	
	
	//1.using algorithm
//	int rev =0;
//	while(num!=0) {
//		rev= rev*10+num%10;
//		num=num/10;
//	}
	
	
	//2. using string buffer class
//	
//	StringBuffer sf =new StringBuffer(String.valueOf(num));
//	  StringBuffer rev = sf.reverse();
//	
	
	
	  //3.using stringbuilding class
	  
//	StringBuilder sb=new StringBuilder();
//	 sb.append(num);
//	 StringBuilder rev= sb.reverse();
	
	//System.out.println("reverse num "+ rev);
  
	
	
	//by giving the values(num)
	int num = 1234;
	int rev= 0;
	while (num!=0) {
		
	rev= rev*10+num%10;
	num=num/10;
	}
	
	System.out.println("reverse num "+ rev);
	
	
	
	
	
}}
