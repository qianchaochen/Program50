package com.qcc.pro11_20;

/**
 * @author: qiancc
 * 2017年07月27日
 * 【程序17】
 * 题目：猴子吃桃问题：猴子第一天摘下若干个桃子，当即吃了一半，还不瘾，又多吃了一个 第二天早上又将剩下的桃子吃掉一半，
 * 又多吃了一个。以后每天早上都吃了前一天剩下的一半零一个。到第10天早上想再吃时，见只剩下一个桃子了。求第一天共摘了多少。
 * 程序分析：采取逆向思维的方法，从后往前推断。
 */
public class Pro17 {
    public static void main(String[] args) {
        int total = total(1);
        System.out.println(total);
        int result = total2();
        System.out.println("第1天共有"+result+"桃子");
    }
//递归
    public static int total(int day){
        int total = 0;
        if(day == 10) {
            total = 1;
        }else{
            total = 2 * total(day+1)+2;
        }
        return total;
    }

//循环
    public static int total2(){
        int total = 1;
        for (int i=9;i>0;i--) {
            total = 2*total+2;
        }
        return total;
    }
}
