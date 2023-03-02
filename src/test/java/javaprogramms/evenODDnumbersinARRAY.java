package javaprogramms;

public class evenODDnumbersinARRAY {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8};
//		int len =a.length;
//		for(int i=0;i<len;i++) {
//			if(a[i]%2==0) {
//				System.out.println("even nuber"+a[i]);
//			}else {
//				System.out.println("odd"+ a[i]);
//			}
	
		//ENHANCED FOR LOOP
		for(int v:a) {
			if(v%2!=0) {
				System.out.println("odd"+ v);
				
			}else {
				System.out.println("even"+v);
			}
		}
		
		
		
	}
	
		
		
		

	}


