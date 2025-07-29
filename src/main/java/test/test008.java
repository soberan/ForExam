package test;

import java.util.Scanner;

public class test008 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int c = s.nextInt();
        int count = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < c; i++) {
            if (c % i == 0) {
                count++;
                result.append(" ").append(i);
            }
        }
        System.out.print(count + result.toString() + " " + c);
    }
}

/**
 * 8.Standings
 *
 * solo发现他参加Online Judge的比赛表现很不稳定，于是他翻开历史记录，发现他在每一轮的比赛中他的排名R都能整除参赛人数N(包括solo)，于是他每次参赛都会先预测他的排名情况，以给自己更大的自信。
 *
 * 解答要求
 * 时间限制: C/C++ 15000ms, 其他语言：30000ms
 *
 * 内存限制: C/C++ 100MB, 其他语言：200MB
 *
 * 输入
 * 输入只有一个整数N(0<N<109)，代表参赛人数。
 *
 * 输出
 * 在一行输出solo参赛可能的获得的排名数S以及由小到大输出各个排名Ri (0<i ≤ S)，用空格隔开。
 *
 * 样例1
 * 复制输入：
 * 10
 * 复制输出：
 * 4 1 2 5 10
 * 解释：
 */