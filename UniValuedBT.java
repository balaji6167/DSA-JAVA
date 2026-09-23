// (Leetcode): 965. Univalued Binary Tree:

// A binary tree is uni-valued if every node in the tree has the same value.
// Given the root of a binary tree, return true if the given tree is uni-valued, or false otherwise.

// Example 1:

// Input: root = [1,1,1,1,1,null,1]
// Output: true

// Example 2:

// Input: root = [2,2,2,5,2]
// Output: false
// Constraints:

// The number of nodes in the tree is in the range [1, 100].
// 0 <= Node.val < 100

public class UniValuedBT{
    public boolean isUnivalTree(TreeNode root) {
        if(root==null) return true;
        Queue<TreeNode> queue = new LinkedList<>();
        int data = root.val;
        queue.add(root);
        while(!queue.isEmpty()){
            TreeNode order = queue.poll();
            if(order.val!=data) return false;
            if(order.left!=null){
                queue.add(order.left);
            }
            if(order.right!=null){
                queue.add(order.right);
            }
        }
        return true;
    }
}