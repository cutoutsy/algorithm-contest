package io.cutoutsy.chapter6;

import java.util.Arrays;

/**
 * 第六章第三节
 *
 * Date: 2017-04-10
 *
 * Author: cutoutsy@gmail.com
 */
public class Section3 {

    public static int ballDown(int D, int I){
        int[] s = new int[1<<20];   //开关数组
        Arrays.fill(s, 0);

        int n = (1<<D) -1;  //最大叶子节点
        int k = 0;
        for (int i = 0; i < I; i++) {
            k = 1;
            for (;;){
                s[k] = 1^s[k];
                if(s[k] == 1){
                    k = k*2;
                }else{
                    k = k*2+1;
                }
                if(k > n){
                    break;
                }
            }
        }
        return k/2;
    }

    public static void main(String[] args){
        System.out.println(ballDown(4, 2));
    }
}
