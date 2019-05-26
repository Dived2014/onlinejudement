package com.dived2014.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 国伟
 * 2019/5/26
 * 13:32
 * Given a binary tree, return the zigzag level order traversal of its nodes' values.
 * (ie, from left to right, then right to left for the next level and alternate between).
 *
 * For example:
 * Given binary tree{3,9,20,#,#,15,7},
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * return its zigzag level order traversal as:
 *
 * [
 *   [3],
 *   [20,9],
 *   [15,7]
 * ]
 */
public class zigzagBinarytree {
    public ArrayList<ArrayList<Integer>> zigzagLevelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        //Queue<Integer> qfloor = new LinkedList<Integer>();
        Stack<TreeNode> stack = new Stack<>();
        Stack<TreeNode> revstack = new Stack<>();
        //Stack<Integer> sfloor = new Stack<>();
        ArrayList<ArrayList<Integer>> ret = new ArrayList<ArrayList<Integer>>();
        if(root == null){
            return ret;
        }
        queue.add(root);
        //qfloor.add(1);
        while(!queue.isEmpty() || !stack.isEmpty()){
            ArrayList<Integer> templist = new ArrayList<>();
            ArrayList<Integer> tempstack = new ArrayList<>();
            while(!queue.isEmpty()){
                TreeNode temp = queue.poll();
                templist.add(temp.val);
                if(temp.left != null){
                    stack.push(temp.left);
                }
                if(temp.right != null){
                    stack.push(temp.right);
                }
            }
            if(templist.size()!=0){
                ret.add(templist);
            }
            while(!stack.isEmpty()){
                TreeNode temp = stack.pop();
                tempstack.add(temp.val);
                if(temp.right != null){
                    revstack.push(temp.right);
                }
                if(temp.left != null){
                    revstack.push(temp.left);
                }

            }
            if(tempstack.size() != 0){
                ret.add(tempstack);
            }
            while(!revstack.isEmpty()){
                queue.add(revstack.pop());
            }
        }
        return ret;
    }
}
