package test;

import java.util.Scanner;

public class test005 {
    public static void main(String[] args) {
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the JAVA output here. For example: System.out.println(s.nextInt());         int[] result = new int[10];
        int[] result = new int[10];
        Scanner s = new Scanner(System.in);
        while (s.hasNextDouble()) {
            double number1 = s.nextDouble();
            int number2 = s.nextInt();
            if (number1 == 0 || number2 == 0) {
                break;
            }
            //Double number1 = 0.795;
            //int number2 = 3;
            for (int i = 0; i < 10; i++) {
                result[i] = (int) (number2 * number1);
                number1 = number1 * number2 - (result[i] * 1.0);
            }
            System.out.print("0." + result[0] + result[1] + result[2] + result[3] + result[4] + result[5] + result[6] + result[7] + result[8] + result[9] + "\n");
        }
    }
}

/**
 * 5.N进制小数
 * 题目描述
 * 编写程序实现将任意10进制正小数m转换成n进制的正小数，小数点后保留10位小数。
 *
 * 解答要求
 * 时间限制：1000ms, 内存限制：100MB
 * 输入
 * 输入包含两个数m,n，用空格隔开。输入包含多组测试，当m,n都为0时输入结束。
 *
 * Limits:
 *
 * 0.0000009<m<1
 * 1<n<10
 * 输出
 * 输出10进制正小数m的n进制小数。结果保留10位小数。
 *
 * 样例
 * 输入样例 1
 *
 * 0.795 3
 * 0 0
 * 输出样例 1
 *
 * 0.2101101122
 */