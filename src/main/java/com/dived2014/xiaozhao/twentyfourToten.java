package com.dived2014.xiaozhao;

import java.util.Scanner;

/**
 * 国伟
 * 2019/5/27
 * 20:57
 */
public class twentyfourToten {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0;i < T;i++){
            char[] ch = sc.nextLine().toCharArray();
            int[] ret = new int[64];
            for(int j = 0 ; j < ch.length;j++){
                funmult(ret,24);
                int target = 0;
                if(ch[j]>='a'){
                    target = 10+ch[j]-'a';
                }else{
                    target = ch[j] - '0';
                }
                funadd(ret,target);
            }
            int pos = ret.length-1;
            while (pos >=0 && ret[pos] == 0){
                pos--;
            }
            if(pos == -1 && ret[0]==0){
                System.out.println(0);
            }else{
                for(;pos>=0;pos--){
                    System.out.print(ret[pos]);
                }
                System.out.println();
            }

        }

    }

    private static void funadd(int[] ret, int target) {
        ret[0]+=target;
        for(int i = 0; i <ret.length;i++){
            if(ret[i]>=10 && i < ret.length){
                ret[i+1]+=ret[i]/10;
                ret[i]%=10;
            }
        }
    }

    private static void funmult(int[] ret, int target) {
        for(int i = 0; i <ret.length;i++){
            ret[i] *= target;
        }
        for(int i = 0; i <ret.length;i++){
            if(ret[i]>=10 && i < ret.length){
                ret[i+1]+=ret[i]/10;
                ret[i]%=10;
            }
        }
    }
}
