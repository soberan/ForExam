package test;

import java.util.Scanner;

public class test001 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextInt()) {
            int a = in.nextInt();
            int b = in.nextInt();
            System.out.println(a + b);
        }
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the JAVA output here. For example: System.out.println(s.nextInt());
    }
}
/**
 * 1.A + B Problem
 * 题目描述
 * Calculate A + B，and give me the answer!
 *
 * 解答要求
 * 时间限制：1000ms, 内存限制：100MB
 * 输入
 * Input two integers A and B, process to the end of the file. (Watch the Sample Input)
 *
 * 输出
 * For each case, output A + B in one line.(Watch the Sample Output)
 *
 * 样例
 * 输入样例 1
 *
 * 1 1
 * 输出样例 1
 *
 * 2
 */