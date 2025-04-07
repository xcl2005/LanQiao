package org.example;

public class WuZiQi {
    static int cnt = 0;

    public static void main(String[] args) {
        // 1. 数组大小 6×6，下标 1…5 有效
        int[][] chess = new int[6][6];
        findw(chess, 0);
        System.out.println(cnt);  // 输出：3126376
    }

    // 白棋
    static void findw(int[][] c, int count) {
        // 2. 基准：下满 25 子时，只统计“无赢家”的局面
        if (count == 25) {
            if (!hasWinner(c)) {     // ← 只有无赢家（平局）才 ++
                cnt++;
            }
            return;                  // ← 记得 return，避免继续下
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (c[i][j] == 0) {
                    c[i][j] = 1;
                    if (!hasWinner(c)) {       // ← 落子后若已有五连则剪枝
                        findb(c, count + 1);
                    }
                    c[i][j] = 0;                // ← 撤销
                }
            }
        }
    }

    // 黑棋
    static void findb(int[][] c, int count) {
        if (count == 25) {
            if (!hasWinner(c)) {     // ← 同上，只统计平局
                cnt++;
            }
            return;
        }

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (c[i][j] == 0) {
                    c[i][j] = 2;        // ← 黑棋用 2
                    if (!hasWinner(c)) {
                        findw(c, count + 1);
                    }
                    c[i][j] = 0;        // ← 撤销
                }
            }
        }
    }

    // 判断任意一方是否已连成 5 子
    static boolean hasWinner(int[][] c) {
        // —— 横向
        for (int i = 1; i <= 5; i++) {
            int color = c[i][1];
            if (color == 0) continue;
            boolean win = true;
            for (int j = 2; j <= 5; j++) {
                if (c[i][j] != color) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // —— 纵向
        for (int j = 1; j <= 5; j++) {
            int color = c[1][j];
            if (color == 0) continue;
            boolean win = true;
            for (int i = 2; i <= 5; i++) {
                if (c[i][j] != color) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // —— 主对角线 (1,1) → (5,5)
        int color1 = c[1][1];
        if (color1 != 0) {
            boolean win = true;
            for (int i = 2; i <= 5; i++) {
                if (c[i][i] != color1) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        // —— 副对角线 (5,1) → (1,5)
        int color2 = c[5][1];
        if (color2 != 0) {
            boolean win = true;
            for (int i = 1; i <= 4; i++) {
                if (c[5 - i][i + 1] != color2) {
                    win = false;
                    break;
                }
            }
            if (win) return true;
        }

        return false;
    }
}

