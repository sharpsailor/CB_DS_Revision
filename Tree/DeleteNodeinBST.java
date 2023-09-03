package Tree;

import Tree.InsertIntoBST.TreeNode;

public class DeleteNodeinBST {
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
		public TreeNode deleteNode(TreeNode root, int key) {
			if(root== null) {
				return null;   
			}
			if(root.val<key) {
				root.right=deleteNode(root.right, key);
			}else if(root.val>key) {
				root.left =deleteNode(root.left, key);
			}else {
//				1 child+ 0 child
				if(root.left==null) {
					return root.right; 
				}else if(root.right==null) {
					return root.left;
				}
/*				2 child
*				else {
*					int lmax = max(root.left);
*					root.left=deleteNode(root.left, lmax);
*					root.val = lmax;
*				}
*/				else {
					int lmin = min(root.right);
					root.right= deleteNode(root.right, key);
					root.val = lmin;
					}
				}
			return root;
			
		}
		public int max(TreeNode root) {
			if(root==null) {
				return Integer.MIN_VALUE; 
			}
			int r = max(root.right);
			return Math.max(r, root.val);
		}
		public int min(TreeNode root) {
			if(root==null) {
				return Integer.MAX_VALUE; 
			}
			int r = min(root.left);
			return Math.min(r, root.val);
		}
	}
}
