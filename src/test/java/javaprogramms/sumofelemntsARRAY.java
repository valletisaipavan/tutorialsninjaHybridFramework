package javaprogramms;

public class sumofelemntsARRAY {
public static void main(String[] args) {
	int a[]= {1,2,3,4};
	int len=a.length;
   System.out.println(len);
	 int sum=0;
      //  normal logic
	 for(int i=0;i<len;i++) {
		 sum=sum+a[i];
	 }
	 
	 
//       another logic	ENHANCED FOR LOOP 
//	 for(int value:a) {
//		 sum=sum+value;
//	 }
//	 
	 
	 
	 System.out.println("sum of the value is ---"+ sum);
	 
	
	
	
	
	
	
	
	
	
	
	
}
}
