package test;

import java.util.Scanner;

public class test010 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNext()) {
            String str = in.nextLine();
            str = str.toLowerCase().replaceAll("a", "A").replaceAll("e", "E")
                    .replaceAll("i", "I").replaceAll("o", "O").replaceAll("u", "U");
            System.out.println(str);
        }
    }
}
/**
 * 10.Vowel
 * <p>
 * solo从小就对英文字母非常感兴趣，尤其是元音字母(a,e,i,o,u,A,E,I,O,U)，他在写日记的时候都会把元音字母写成大写的，辅音字母则都写成小写，虽然别人看起来很别扭，但是solo却非常熟练。你试试把一个句子翻译成solo写日记的习惯吧。
 * <p>
 * 解答要求
 * 时间限制: C/C++ 1000ms, 其他语言：2000ms
 * <p>
 * 内存限制: C/C++ 100MB, 其他语言：200MB
 * <p>
 * 输入
 * 输入一个字符串S(长度不超过100，只包含大小写的英文字母和空格)。
 * <p>
 * 输出
 * 按照solo写日记的习惯输出翻译后的字符串S。
 * <p>
 * 样例1
 * 复制输入：
 * Who Love Solo
 * 复制输出：
 * whO lOvE sOlO
 * 解释：
 */