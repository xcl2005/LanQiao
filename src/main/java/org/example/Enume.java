package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Enume {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int[] a = new int[26];
		int MaxNum  = 0;
		char MaxChar = 0;
		for (int i = 0; i < word.length(); i++) {
		      a[word.charAt(i)-'a']++;
		}
		for (int i = 0; i < a.length; i++) {
		      MaxNum = Math.max(MaxNum, a[i]);
		      if(a[i]==MaxNum);
		}
		for (int i = 0; i < a.length; i++) {
		     if(a[i]==MaxNum) { 
		    	 MaxChar = (char)(i+'a');
		    	 break;
		     }
		}
		System.out.println(MaxChar);
		System.out.println(MaxNum);
	}

}
