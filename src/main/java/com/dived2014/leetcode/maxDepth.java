package com.dived2014.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 国伟
 * 2019/5/26
 * 13:24
 * Given a binary tree, find its maximum depth.
 *
 * The maximum depth is the number of nodes along the longest path
 * from the root node down to the farthest leaf node.
 */

//Definition for binary tree
class TreeNode {
int val;
   TreeNode left;
   TreeNode right;
   TreeNode(int x) { val = x; }
 }
public class maxDepth {

    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;

        }
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> depth = new LinkedList<>();
        queue.add(root);
        depth.add(1);
        int tempdepth = 1;
        while(!queue.isEmpty()){
            TreeNode temp = queue.poll();
            tempdepth = depth.poll();
            if(temp.left != null){
                queue.add(temp.left);
                depth.add(tempdepth+1);
            }
            if(temp.right != null){
                queue.add(temp.right);
                depth.add(tempdepth+1);
            }
        }
        return tempdepth;
    }

}
