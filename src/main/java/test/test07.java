package test;

import java.util.Scanner;

public class test07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] strs = in.nextLine().split(" ");
        int len = 0;
        for(String str : strs){
            len += str.length();
        }
        System.out.println(String.format("%.2f",(double)len/strs.length));
    }
}
/**
 * 题目描述
 * 每个句子由多个单词组成，句子中的每个单词的长度都可能不一样，我们假设每个单词的长度Ni为该单词的重量，你需要做的就是给出整个句子的平均重量V。
 *
 * 解答要求
 * 时间限制：1000ms, 内存限制：100MB
 * 输入
 * 输入只有一行，包含一个字符串S(长度不会超过100)，代表整个句子，句子中只包含大小写的英文字母，每个单词之间有一个空格。
 *
 * 输出
 * 输出句子S的平均重量V(四舍五入保留两位小数)。
 *
 * 样例
 * 输入样例 1
 *
 * Who Love Solo
 * 输出样例 1
 *
 * 3.67
 * 提示样例 1
 */