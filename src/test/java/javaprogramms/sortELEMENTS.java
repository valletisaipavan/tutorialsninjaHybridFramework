package javaprogramms;


import java.util.Arrays;
import java.util.Collections;

public class sortELEMENTS {
public static void main(String[] args) {
//	int a[]= {1,28,3,57,9};
	 //APPROCH-1
	//System.out.println("sort before"+Arrays.toString(a));
//	Arrays.parallelSort(a);
//	System.out.println(Arrays.toString(a));
	
	
//	APPROCH-2
//	Arrays.sort(a);
//	System.out.println(Arrays.toString(a));
	
	
	//APPROCH-3     REVERSE DESCENDING ORDER.
	Integer a[]={1,28,3,57,9};
	Arrays.sort(a,Collections.reverseOrder());
	System.out.println(Arrays.toString(a));
}
}
