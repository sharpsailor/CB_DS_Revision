package Tree;
import java.util.*;
public class PseudoPallindromicPath {
	class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int val) {
			this.val = val;
		}
	}

	class Solution {
		public int pseudoPalindromicPaths(TreeNode root) {
			ArrayList<List<Integer>> ans = new ArrayList<>();
			check(root, ans);
			int count = 0;
			for (List<Integer> list : ans) {
				for (int nums : list) {
					if(Pallindrome(nums)) {
						count++;
					};
				}
			}
			return count;
		}

		public void check(TreeNode root, ArrayList<List<Integer>> ans) {
			ArrayList<Integer> list = new ArrayList<>();
			if (root == null) {
				ans.add(list);
				return;
			}
			list.add(root.val);
			check(root.left, ans);
			check(root.right,ans);

		}

		private boolean Pallindrome(int[] nums) {
			HashMap<Integer, Integer> map = new HashMap<>();
			for (int num : nums) {
				map.put(num, map.getOrDefault(num, 0) + 1);
			}
			int oddCount = 0;
			for (int Count : map.values()) {
				if (Count % 2 != 0) {
					oddCount++;
				}
			}
			return oddCount <= 1;
		}
	}
}
