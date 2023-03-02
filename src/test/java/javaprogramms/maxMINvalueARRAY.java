package javaprogramms;

public class maxMINvalueARRAY {
public static void main(String[] args) {
	int a[]= {20,22,39,0,5,200,1};
	int min =a[0];
		
	for(int i=1;i<a.length;i++) {
		if(a[i]<min) {          //MAXIMUN if(a[i]>max)
			min=a[i];
		}
	}System.out.println(min);
	
	
	
	

}}
