package javaprogramms;

public class TWOarraysEQALorNOT {

	public static void main(String[] args) {
		int a[] = { 1, 2, 3, 4, 5 };
		int b[] = { 1, 2, 3, 4, 5 };
		boolean	status=true;
		if (a.length == b.length) {
		for(int i=0;i<a.length;i++) {
			if(a[i]==b[i]) {
				status=true;
			}else {
				status=false;
			}
		}
			
			
		}else {
			status =false;
		}if(status==true) {
			System.out.println("its passed");
		}else {
			System.out.println("its failed");
		}
			
			
	}
}
			
			
			
			
			
			
			
			
			
			
