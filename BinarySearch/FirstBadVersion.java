package BinarySearch;

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
	public static int MaxSumSubaaray(int[]arr) {
		int ans = Integer.MIN_VALUE;
		for(int i =0;i<arr.length;i++) {
			int prev = 0;
			for(int j =i;j<arr.length;j++) {
				prev += arr[i];
				ans = Math.max(ans, prev);
			}
		}
		return ans;
	}

}
