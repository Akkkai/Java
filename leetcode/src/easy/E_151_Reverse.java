package easy;

import java.util.Stack;

/*
* 给定一个字符串，逐个翻转字符串中的单词。"the sky    is blue"
* 1.无空格字符串构成一个单词。
* 2.输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
* 3.如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
*
*
* 分析：双重for循环，O(n2)的时间复杂度不可取。
*       输入和输出拥有栈的数据结构特征。所以考虑到用栈。
* */
public class E_151_Reverse {
    public static void main(String[] args) {
        String ss = "the sky    is blue";
        System.out.println(reverseWord(ss));
    }

    private static String reverseWord(String s) {
        Stack<String> stack = new Stack<>();
        String temp = "";

        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != ' ') {
                temp += s.charAt(i);
            } else if (temp != "") {
                stack.push(temp);
                temp = "";
            } else {
                continue;
            }
        }
        if (temp != "") {
            stack.push(temp);
        }
        String result = "";
        while (!stack.empty()) {
            result += stack.pop() + " ";
        }
        return result.substring(0, result.length()-1);
    }
}
