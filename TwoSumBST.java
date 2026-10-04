// (Leetcode): 653. Two Sum IV - Input is a BST:

// Given the root of a binary search tree and an integer k, return true if there exist two elements in the BST such that their sum is equal to k, or false otherwise.

// Example 1:

// Input: root = [5,3,6,2,4,null,7], k = 9
// Output: true

// Example 2:

// Input: root = [5,3,6,2,4,null,7], k = 28
// Output: false
 
// Constraints:
// The number of nodes in the tree is in the range [1, 104].
// -10^4 <= Node.val <= 10^4
// root is guaranteed to be a valid binary search tree.
// -10^5 <= k <= 10^5

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import javax.swing.tree.TreeNode;
public class TwoSumBST{
    public boolean findTarget(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();
        List<Integer> inOrderValues = new ArrayList<>();
        TreeNode node = root;
        while(true){
            if(node!=null){
                stack.push(node);
                node = node.left;
            }
            else{
                if(stack.isEmpty()){
                    break;
                }
                node = stack.pop();
                inOrderValues.add(node.val);
                node = node.right;
            }
        }
        int start = 0,end = inOrderValues.size()-1;
        while(start<end){
            int sum = inOrderValues.get(start)+inOrderValues.get(end);
            if(sum==k){
                return true;
            }
            else if(sum>k){
                end--;
            }
            else{
                start++;
            }
        }
        return false;
    }
}