// (Leetcode): 230. Kth Smallest Element in a BST:

// Given the root of a binary search tree, and an integer k, return the kth smallest value (1-indexed) of all the values of the nodes in the tree.

// Example 1:

// Input: root = [3,1,4,null,2], k = 1
// Output: 1

// Example 2:

// Input: root = [5,3,6,2,4,null,null,1], k = 3
// Output: 3
 
// Constraints:
// The number of nodes in the tree is n.
// 1 <= k <= n <= 10^4
// 0 <= Node.val <= 10^4

public class KthSmallValueBST{
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        TreeNode inOrder = root;
        List<Integer> list = new ArrayList<>();
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
                list.add(inOrder.val);
                inOrder = inOrder.right;
            }
        }
        return list.get(k-1);
    }
}