package javaprogramms;

public class searchELEMNTinARY {
public static void main(String[] args) {
	int a[]= {50,52,2,58,21};
	boolean flag=false;
	int ser =2;
	for(int i=0;i<a.length;i++) {
		if(a[i]==ser) {
			flag=true;
			System.out.println("index value os search-elementi---"+i);
		}
	}
	if(flag==false) {
		System.out.println("no-search-element");
	}
	
	
	
}
}
