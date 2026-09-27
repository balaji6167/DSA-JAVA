// (Leetcode): 530. Minimum Absolute Difference in BST:

// Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

// Example 1:

// Input: root = [4,2,6,1,3]
// Output: 1

// Example 2:

// Input: root = [1,0,48,null,null,12,49]
// Output: 1
 
// Constraints:
// The number of nodes in the tree is in the range [2, 10^4].
// 0 <= Node.val <= 10^5

public class MinAbsDiffBST{
    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i=0;i<size;i++){
                TreeNode order = queue.poll();
                list.add(order.val);
                if(order.left!=null){
                    queue.add(order.left);
                }
                if(order.right!=null){
                    queue.add(order.right);
                }
            }
        }
        Collections.sort(list);
        int min = Integer.MAX_VALUE;
        for(int i = 1; i < list.size(); i++){
            min = Math.min(min, list.get(i) - list.get(i - 1));
        }
        return min;
    }
}