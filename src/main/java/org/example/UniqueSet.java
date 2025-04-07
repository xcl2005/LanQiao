package org.example;

import java.util.*;

public class UniqueSet {
	public static void main(String[] args) {
		Scanner scan = new 	Scanner(System.in);
		int t = scan.nextInt();
		for (int i = 1; i <= t; i++) {
			int n = scan.nextInt();
			Set<Integer> set = new HashSet<>();
			for (int j = 1; j <=n; j++) {
				int x = scan.nextInt();
				if(set.contains(x)) {
				continue;
			}
	            System.out.print(x+" ");
	            set.add(x);
		}
	    System.out.println();
	}

 }
}
