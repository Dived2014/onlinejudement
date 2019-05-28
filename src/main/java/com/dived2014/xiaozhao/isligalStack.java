package com.dived2014.xiaozhao;

import java.util.*;

/**
 * 国伟
 * 2019/5/27
 * 20:41
 */
public class isligalStack {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < T;i++){
            char[] in = sc.nextLine().toCharArray();
            char[] out = sc.nextLine().toCharArray();
            Stack<Character> stack = new Stack<>();
            int index = 0;
            for(int j = 0; j < in.length;j++){
                while (!stack.isEmpty()
                        && stack.peek().equals(out[index])){
                    index++;
                    stack.pop();
                }
                stack.push(in[j]);
            }
            while(!stack.isEmpty() && stack.peek().equals(out[index])){
                index++;
                stack.pop();
            }
            if(!stack.isEmpty()){
                System.out.println("N");
            }else{
                System.out.println("Y");
            }
        }
    }
}
