package com.newton.console.prefixcode;

import java.util.Arrays;

public class FindPrefix {


    public static void main(String[] args){
        String[] strs = {"flower","flow","flight"};
        System.out.println("通用前缀是="+findPrefix(strs));
    }

    private static String findPrefix(String[] strs){
        int len = strs.length;
        StringBuffer sb = new StringBuffer();
        if(strs == null || len==0){
            return "";
        }

        Arrays.sort(strs);
        int m = strs[0].length();
        int n = strs[len-1].length();

        int num = Math.min(m,n);
        for (int i=0;i<num;i++){
            if(strs[0].charAt(i)== strs[len-1].charAt(i)){
                sb.append(strs[0].charAt(i));
            }else {
                break;
            }
        }
        return sb.toString();
    }
}
