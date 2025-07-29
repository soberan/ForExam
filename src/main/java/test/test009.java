package test;

import java.util.Scanner;

public class test009 {
    public static void main(String[] args) {
        // please define the JAVA input here. For example: Scanner s = new Scanner(System.in);
        // please finish the function body here.
        // please define the JAVA output here. For example: System.out.println(s.nextInt());

        //1.奇数一定存在连续正整数相加
        //2.偶数若为2的n次方则一定不存在连续正整数相加
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int i = num & (num - 1);//判断num是否是2的幂
        System.out.println(i == 0 ? "NO" : "YES");
    }
}

/**
 * 9.Consecutive Integer
 * 2005年的百度之星初赛有这么一道题，一个正整数有可能可以被表示为 m(m>1) 个连续正整数之和，如：
 *
 * 15=1+2+3+4+5
 * 15=4+5+6
 * 15=7+8
 * 但现在你的任务是判断给定的整数n能否表示成连续的m(m>1)个正整数之和。
 *
 * 解答要求
 * 时间限制: C/C++ 1000ms, 其他语言：2000ms
 *
 * 内存限制: C/C++ 100MB, 其他语言：200MB
 *
 * 输入
 * 输入只有一个整数n (1<n<230 +1)。
 *
 * 输出
 * 若n能表示成连续的m(m>1)个正整数之和则输出“YES”，否则输出“NO”。
 *
 * 样例1
 * 复制输入：
 * 15
 * 复制输出：
 * YES
 * 解释：
 */