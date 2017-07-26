package com.qcc.pro01_10;

/**
 * @author: qiancc
 * 2017年07月25日
 * 【程序7】
 * 题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
 * 程序分析：利用while语句,条件为输入的字符不为'\n'.
 */
public class Pro7 {

    public static void main(String[] args) {
        String str = "abcd1234 ef  钱#34c朝$";
        count(str);

    }

    public static void count(String str) {
        char[] chars = str.toCharArray();
        String[] strings = new String[chars.length];
        for (int i = 0; i < chars.length; i++) {
            strings[i] = String.valueOf(chars[i]);
        }
        int wordsCount = 0;
        int chineseCount = 0;
        int spaceCount = 0;
        int numCount = 0;
        int otherCount = 0;
        for (String s : strings) {
            if (s.matches("[0-9]")) {
                numCount++;
            } else if (s.matches("[a-zA-Z]")) {
                wordsCount++;
            } else if (s.matches("[\u4e00-\u9fa5]")) {
                chineseCount++;
            } else if (s.matches("\\s")) {
                spaceCount++;
            } else {
                otherCount++;
            }
        }
        System.out.println("word: " + wordsCount + ", chinese: " + chineseCount + ", space: " + spaceCount
                + ", num: " + numCount + ", other: " + otherCount);

    }

}
