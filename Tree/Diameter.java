package Tree;

import Tree.BinaryTree.Node;

public class Diameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	class Solution {
		private int height(TreeNode root) {
			// TODO Auto-generated method stub
			if(root==null) {
				return 0; // 0-> single node ht = 1 aur agr -1 toh single node ki ht 0
			}
			int lheight = height(root.left);
			int rheight = height(root.right);
			return Math.max(lheight, rheight)+1;
		}
	    public int diameterOfBinaryTree(TreeNode root) {
	    	if(root == null) {
	    		return 0;
	    	}
	        int ld = diameterOfBinaryTree(root.left);
	        int rd = diameterOfBinaryTree(root.right);
	        int sd = height(root.left)+height(root.right)+2;
	        return Math.max(ld, Math.max(sd, rd));
	    }
	}
//	 Optimised Approach
	public class DiaPair{
		int d =0;
		int ht = -1;
		
	}
	class solution{
		public int diameterOfBinaryTree(TreeNode node) {
			return diameter(node).d;
		}

		private DiaPair diameter(TreeNode node) {
			// TODO Auto-generated method stub
			DiaPair ldp  = diameter(node.left);
			DiaPair rdp  = diameter(node.right);
			DiaPair sdp = new DiaPair();
			sdp.ht = Math.max(ldp.ht, rdp.ht)+1;
			int dia =  ldp.ht+rdp.ht+2;
			sdp.d = Math.max(dia, Math.max(ldp.d, rdp.d));
			return sdp;
		}
	}
}

