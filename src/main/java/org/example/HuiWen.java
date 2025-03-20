package org.example;


import java.util.Scanner;

public class HuiWen {
	 //lanqiao19718
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			
			 char[] a = scan.next().toCharArray();
	         int length = a.length;
			  int prr = length-1;
				if(prr == 0) {
					  System.out.println("Yes"); 
				      continue;
				 } 
			  boolean x = false;
			  while((a[prr]==108 || a[prr]==113|| a[prr]==98) && prr>0) {			
				 x =detect(a,prr);
				 if(x==true) break;
				 prr--;
			}				  
			      
			  if(x == true) System.out.println("Yes");
			  else if(x== false) {
				  x =detect(a,prr);
				  if(x==false)System.out.println("No");
				  else System.out.println("Yes");
				  } 
		}
	}
	static boolean detect(char[] a, int j) {
		int i = 0;
		while(i<j) {
			if(a[i]==a[j]) {i++; j--;}
			else return false;
		}
		return true;
	}


}
