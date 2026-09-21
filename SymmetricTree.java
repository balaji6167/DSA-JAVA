// (Leetcode) 101. Symmetric Tree:

// Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
// Example 1:

// Input: root = [1,2,2,3,4,4,3]
// Output: true

// Example 2:

// Input: root = [1,2,2,null,3,null,3]
// Output: false
 
// Constraints:
// The number of nodes in the tree is in the range [1, 1000].
// -100 <= Node.val <= 100


import java.util.LinkedList;
import java.util.Queue;
import javax.swing.tree.TreeNode;

public class SymmetricTree{
    public boolean isSymmteric(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root.left);
        queue.add(root.right);
        while(!queue.isEmpty()){
            TreeNode t1 = queue.poll();
            TreeNode t2 = queue.poll();
            if(t1==null && t2==null){
                continue;
            }
            if(t1==null || t2==null || t1.val!=t2.val){
                return false;
            }
            queue.add(t1.left);
            queue.add(t2.right);
            queue.add(t1.right);
            queue.add(t2.left);
        }
        return true;
    }
}