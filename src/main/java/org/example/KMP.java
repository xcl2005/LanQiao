package org.example;

import java.util.Scanner;

public class KMP {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		char c1[] = scan.next().toCharArray();
		char c2[] = scan.next().toCharArray();
		int[] next = new int[c1.length];
		for (int i = 1,j=0; i < c1.length; i++) {
			//每次进入for,j为匹配后相同前缀的下一个索引，i为匹配后相同后缀的下一个索引
			while(j>0 && c1[j]!=c1[i]) j=next[j-1]; 
			/*这里j为已经前缀的下一位，c1[0]到c1[j-1]与c1[i-1-j]到c1[i-1]完全相同（称为s），
			  s本身的前后缀匹配信息也记录在next数组，这是KMP算法的精髓所在 
			  由于j是指向的下一个，j-1才是最大已匹配字符串。那么next[j-1]为s最大相等后缀
			  即c1[0]到c1[next[j-1]]与c1[i-1-next[j-1]]到c1[i-1]相同，可匹配下一个是否相同
			  
			  如果这里改为j--,可能回到一个j i匹配，但是j前面部分与目前i-1-j到i-1这两段不匹配的位置
			  导致回退停在一个错误的位置使回退不完整，需要另加循环条件 且复杂度为O（N2）
			*/
			if(c1[i]==c1[j]) j++;                     
			next[i]=j;
		}
		int ans=0;
		for (int i = 0,j = 0; i < c2.length; i++) {
		    while(j>0 && c1[j]!=c2[i]) j=next[j-1];
		    if(c2[i]==c1[j]) j++;
		    if(j==c1.length) {
		    	ans++;
		    	j=0;
		    }
			
		}
		System.out.println(ans);
		
	}
}
