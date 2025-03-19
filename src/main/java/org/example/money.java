import java.util.Scanner;

public class money {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // 读取测试用例的数量

        while (t-- > 0) {
            long N = scanner.nextLong(); // 读取初始总价
            long M = scanner.nextLong(); // 读取代金券面值

            long smallest = -1; // 用于记录最小的满足条件的数字

            // 遍历所有可能的插入位置
            for (int i = 0; i <= String.valueOf(N).length(); i++) {
                // 遍历所有可能的插入数字
                for (int j = 0; j <= 9; j++) {
                    String newNumber = insertDigit(String.valueOf(N), i, j);
                    long num = Long.parseLong(newNumber);

                    // 检查新生成的数字是否是M的倍数，并且比N大
                    if (num > N && num % M == 0) {
                        if (smallest == -1 || num < smallest) {
                            smallest = num;
                        }
                    }
                }
            }

            // 输出结果
            System.out.println(smallest);
        }
    }

    private static String insertDigit(String number, int index, int digit) {
        StringBuilder sb = new StringBuilder(number);
        sb.insert(index, (char)('0'+digit));
        return sb.toString();
    }
}