package Tree;

import Tree.Diameter.TreeNode;

public class IsBalanced {
	public class balancedPair{
	     boolean isBal = true;
	     int ht = -1;
	 }
	class Solution {
	    public boolean isBalanced(TreeNode root) {
	         return isBalancedPair(root).isBal;
	    }
	    public balancedPair isBalancedPair(TreeNode root) {
	    	if(root == null) {
	    		return new balancedPair();
	    	}
	    	balancedPair lbp = isBalancedPair(root.left);
	    	 balancedPair rbp = isBalancedPair(root.right);
	    	 balancedPair sbp = new balancedPair();
	    	 sbp.ht = Math.max(lbp.ht, rbp.ht)+1;
	    	 int bf = Math.abs(lbp.ht-rbp.ht);
	    	 sbp.isBal = lbp.isBal && rbp.isBal && bf <=1;
	    	 return sbp;
	    }
	}
}
