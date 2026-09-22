// (Leetcode):515. Find Largest Value in Each Tree Row:

// Given the root of a binary tree, return an array of the largest value in each row of the tree (0-indexed).

// Example 1:

// Input: root = [1,3,2,5,3,null,9]
// Output: [1,3,9]

// Example 2:

// Input: root = [1,2,3]
// Output: [1,3]
 
// Constraints:
// The number of nodes in the tree will be in the range [0, 104].
// -2^31 <= Node.val <= 2^31 - 1

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import javax.swing.tree.TreeNode;
public class MaxValueInEachTreeRow {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> maxValues = new ArrayList<>();
        if(root==null) return maxValues;
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
            Collections.sort(levels);
            maxValues.add(levels.get(levels.size()-1));
        }
        return maxValues;
    }
}
