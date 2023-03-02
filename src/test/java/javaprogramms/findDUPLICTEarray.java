package javaprogramms;

import java.util.HashSet;

public class findDUPLICTEarray {
public static void main (String[] args) {
	String a[]= {"o","c","k","phython","k","java"};
boolean flag=false;
//     APPROCH-1
//	for(int i=0;i<a.length;i++) {
//		for(int j=i+1;j<a.length;j++) {
//			if(a[i]==a[j]) {
//				System.out.println(a[i]);
//				flag=true;
//			}
//		}
//	}


//APPROCH=2

HashSet <String>langs=new HashSet();
for(String l:a) {
	if(langs.add(l)==false) {
		System.out.println("duplicate-----"+l);
	}
}



//
//
//if(flag==false) {
//	System.out.println("no duplicate");
//}
}
}
