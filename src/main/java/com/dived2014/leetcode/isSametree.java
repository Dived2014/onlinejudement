package com.dived2014.leetcode;

/**
 * 国伟
 * 2019/5/26
 * 14:01
 * 题目描述
 *
 * Given two binary trees,
 * write a function to check if they are equal or not.
 *
 * Two binary trees are considered equal
 * if they are structurally identical
 * and the nodes have the same value.
 */
public class isSametree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if( p == null && q == null){
            return true;
        }
        return fun(p,q);
    }
    public boolean fun(TreeNode p,TreeNode q){
        if(p == null && q == null){
            return true;
        }
        if(p == null || q == null){
            return false;
        }
        if(p.val==q.val){
            return fun(p.left,q.left)&&fun(p.right,q.right);
        }
        return false;
    }
}
