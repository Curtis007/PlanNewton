package com.newton.console.fibonacci;

/**
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法?
 *
 * 思路分析：
 *
 * 本质上是一个 斐波那契 问题
 * 每跳跃一次有2种情况
 *     跳1个台阶，或跳2个台阶
 *
 *     f(n) = f(n-1) + f(n-2)
 *
 * Created By Curtis
 */
public class FlogJump {

    public static void main(String[] args){
        System.out.println("一共有"+jumpFloor(10)+"种跳法！");
    }

     private static int jumpFloor(int number){
        //没有台阶你跳个鬼
        if(number == 0){
            return 0;
        }
        if(number == 1){
            return 1;
        }
        if(number == 2){
            return 2;
        }

        int first = 1,second=2,third=0;
        for(int i=3;i<=number;i++){
            third  = first + second;
            first  = second;
            second = third;
        }
        return third;
    }
}
