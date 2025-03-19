package org.example;

import java.util.Scanner;

public class XiaoMingDeZiFuChuan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String t = in.next();
        int len = t.length();
        for (int i = len; i > 0; i--) {
            if (s.contains(t.substring(0, i))) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);

    }
}
