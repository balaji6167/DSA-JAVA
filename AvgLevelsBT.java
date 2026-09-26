// (LeetCode): 637. Average of Levels in Binary Tree:

// Given the root of a binary tree, return the average value of the nodes on each level in the form of an array. Answers within 10-5 of the actual answer will be accepted. 

// Example 1:

// Input: root = [3,9,20,null,null,15,7]
// Output: [3.00000,14.50000,11.00000]
// Explanation: The average value of nodes on level 0 is 3, on level 1 is 14.5, and on level 2 is 11.
// Hence return [3, 14.5, 11].

// Example 2:

// Input: root = [3,9,20,15,7]
// Output: [3.00000,14.50000,11.00000]
 
// Constraints:
// The number of nodes in the tree is in the range [1, 104].
// -2^31 <= Node.val <= 2^31 - 1

public class AvgLevelsBT{
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> avgLevels = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            double val = 0;
            double sum = 0;
            for(int i=0;i<size;i++){
                TreeNode order = queue.poll();
                sum += order.val;
                if(order.left!=null){
                    queue.add(order.left);
                }
                if(order.right!=null){
                    queue.add(order.right);
                }
                val++;
            }
            avgLevels.add(sum/val);
        }
        return avgLevels;
    }
}