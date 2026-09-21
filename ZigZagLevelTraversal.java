// (LeetCode): 103. Binary Tree Zigzag Level Order Traversal:

// Given the root of a binary tree, return the zigzag level order traversal of its nodes' values. (i.e., from left to right, then right to left for the next level and alternate between).

// Example 1:

// Input: root = [3,9,20,null,null,15,7]
// Output: [[3],[20,9],[15,7]]

// Example 2:

// Input: root = [1]
// Output: [[1]]

// Example 3:

// Input: root = []
// Output: []
 
// Constraints:
// The number of nodes in the tree is in the range [0, 2000].
// -100 <= Node.val <= 100

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class ZigZagLevelTraversal {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> zigZag = new ArrayList<>();
        int index = 0;
        if(root==null){
            return zigZag;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            List<Integer> levels = new ArrayList<>();
            for(int i=0;i<size;i++){
                TreeNode order = queue.poll();
                levels.add(order.val);
                if(order.left!=null){
                    queue.add(order.left);
                }
                if(order.right!=null){
                    queue.add(order.right);
                }
            }
            if((index++)%2==0){
                zigZag.add(levels);
            }
            else{
                Collections.reverse(levels);
                zigZag.add(levels);
            }
        }
        return zigZag;
    }
}