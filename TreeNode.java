//Leetcode 1123. Lowest Common Ancestor of Deepest Leaves
public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
   /**
    * Finds the lowest common ancestor (LCA) of the deepest leaves in a binary tree.
    *
    * @param root the root of the binary tree.
    * @return the TreeNode representing the LCA of the deepest leaves.
    */
   public TreeNode lcaDeepestLeaves(TreeNode root) {
       return depthFirstSearch(root).getKey();
   }

   /**
    * Helper method to perform depth-first search to find the LCA of the deepest leaves.
    *
    * @param node the current node under consideration.
    * @return a Pair containing the current LCA node and the depth of the subtree rooted at the node.
    */
   private Pair<TreeNode, Integer> depthFirstSearch(TreeNode node) {
       if (node == null) {
           // Base case: if the current node is null, return a pair of (null, 0)
           return new Pair<>(null, 0);
       }
       // Recursively find the depth and LCA in the left subtree
       Pair<TreeNode, Integer> leftPair = depthFirstSearch(node.left);
       // Recursively find the depth and LCA in the right subtree
       Pair<TreeNode, Integer> rightPair = depthFirstSearch(node.right);
     
       int leftDepth = leftPair.getValue(), rightDepth = rightPair.getValue();
     
       if (leftDepth > rightDepth) {
           // If the left subtree is deeper, return the LCA and depth of the left subtree
           return new Pair<>(leftPair.getKey(), leftDepth + 1);
       }
       if (leftDepth < rightDepth) {
           // If the right subtree is deeper, return the LCA and depth of the right subtree
           return new Pair<>(rightPair.getKey(), rightDepth + 1);
       }
       // If both subtrees have the same depth, the current node is the LCA
       return new Pair<>(node, leftDepth + 1);
   }
}

/**
* A helper class to store a pair of objects.
*
* @param <K> the type of the first element.
* @param <V> the type of the second element.
*/
class Pair<K, V> {
   private K key;
   private V value;

   public Pair(K key, V value) {
       this.key = key;
       this.value = value;
   }
 
   public K getKey() {
       return key;
   }
 
   public V getValue() {
       return value;
   }
}
