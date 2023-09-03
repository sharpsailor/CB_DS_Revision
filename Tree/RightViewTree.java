package Tree;

import java.util.*;

public class RightViewTree {
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
	int max_depth = -1;
	class Solution {
	    public List<Integer> rightSideView(TreeNode root) {
	    	List<Integer> ll = new ArrayList<>();
	    	view(root, ll,0);
	    	return ll;
	    }
	    public void view(TreeNode root,List<Integer>ll, int curr){
	        if(root==null) {
	        	return ;
	        }
	    	if(curr>max_depth) {
	    		ll.add(root.val);
	    		max_depth= curr;
	        }
	    	view(root.right, ll, curr+1);
	    	view(root.left, ll, curr+1);
	    }
	}
}
