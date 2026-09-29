// (LeetCode): 783. Minimum Distance Between BST Nodes:

// Given the root of a Binary Search Tree (BST), return the minimum difference between the values of any two different nodes in the tree.
 
// Example 1:

// Input: root = [4,2,6,1,3]
// Output: 1

// Example 2:

// Input: root = [1,0,48,null,null,12,49]
// Output: 1
 
// Constraints:
// The number of nodes in the tree is in the range [2, 100].
// 0 <= Node.val <= 10^5

public class MinDiffBST{
    public int minDiffInBST(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        int min = Integer.MAX_VALUE;
        TreeNode inOrder = root;
        int prev = 0;
        boolean hasPrev = false;
        while (true) {
            if (inOrder != null) {
                stack.push(inOrder);
                inOrder = inOrder.left;
            } 
            else {
                if (stack.isEmpty()) {
                    break;
                }
                inOrder = stack.pop();
                int curr = inOrder.val;
                if (hasPrev) {
                    min = Math.min(min, curr - prev);
                }
                prev = curr;
                hasPrev = true;
                inOrder = inOrder.right;
            }
        }
        return min;
    }
}