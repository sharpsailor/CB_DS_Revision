package Tree;

import Tree.Diameter.TreeNode;

public class LCA {
	class Solution {
	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(root==null) {
	        	return null;
	        }
	        if(root==p|| root==q) {
	        	return root;
	        }
	        TreeNode left = lowestCommonAncestor(root.left, p, q);
	        TreeNode right = lowestCommonAncestor(root.right, p, q);
	        if(left!=null && right==null) {
	        	return root;
	        }
	        if(left==null) {
	        	return right;
	        }else {
	        	return left;
	        }
	    }
	}
	class solution {

	    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
	        if(!find(root,q)|| !find(root,p)) {
	        	return null;
	        }
	        return LCA(root, p, q);
	    }
	    public TreeNode LCA(TreeNode root, TreeNode p, TreeNode q) {
	    	if(root==null) {
	        	return null;
	        }
	        if(root==p|| root==q) {
	        	return root;
	        }
	        TreeNode left = LCA(root.left, p, q);
	        TreeNode right = LCA(root.right, p, q);
	        if(left!=null && right==null) {
	        	return root;
	        }
	        if(left==null) {
	        	return right;
	        }else {
	        	return left;
	        }
	    }
	    public boolean find(TreeNode  root, TreeNode p) {
	    	if(root ==null)
	    	{
	    		return false;
	    	}
	    	if(root==p) {
	    		return true;
	    	}
	    	return find(root.left,p)||find(root.right,p);
	    }
	}

}
