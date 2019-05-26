package com.dived2014.offer;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 国伟
 * 2019/5/26
 * 13:19
 * 题目描述
 * 输入一个链表，按链表值从尾到头的顺序返回一个ArrayList。
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}


public class printListFromTailToHead {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;
    }
}
