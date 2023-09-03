package Tree;

public class InsertIntoBST {
	
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
	    public TreeNode insertIntoBST(TreeNode root, int val) {
	        if(root == null) {
	        	TreeNode nn = new TreeNode();
	        	nn.val = val;
	        	return nn;
	        }
	    	if(val>root.val) {
	        	root.right = insertIntoBST(root.right, val);
	        }
	        else {
	        	root.left = insertIntoBST(root.left, val);	        	
	        }
	    	return root;
	    }
	}
}
