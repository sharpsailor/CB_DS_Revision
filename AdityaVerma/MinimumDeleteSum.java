package AdityaVerma;

import java.util.HashSet;

public class MinimumDeleteSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s1 = "sea";
	        String s2 = "eat";
	        int result1 = minimumDeleteSum(s1, s2);
	        System.out.println("Minimum Delete Sum: " + result1);
//
//	        s1 = "delete";
//	        s2 = "leet";
//	        int result2 = minimumDeleteSum(s1, s2);
//	        System.out.println("Minimum Delete Sum: " + result2);
//
//	        // Additional test cases
//	        s1 = "abcde";
//	        s2 = "fghij";
//	        int result3 = minimumDeleteSum(s1, s2);
//	        System.out.println("Minimum Delete Sum: " + result3);
	}
	public static int minimumDeleteSum(String s1, String s2) {
        return LCS(s1,s2,s1.length(),s2.length());        
    }
    private static int LCS(String s1 , String s2 , int n , int m){
        int[][] t = new int[n+1][m+1];
        for(int i =0;i<n+1;i++){
            for(int j =0;j<m+1;j++){
                if(i==0 || j==0){
                    t[i][j]= 0;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1)){
                    t[i][j]=1+t[i-1][j-1];
                }else{
                    t[i][j]= Math.max(t[i-1][j],t[i][j-1]);
                }
            }
        }
        System.out.println(t[n][m]);
        StringBuilder sb = new StringBuilder();
		int i =n, j = m;
		while(i>0 && j>0) {
			if(s1.charAt(i-1)==s2.charAt(j-1)) {
				sb.append(s1.charAt(i-1));
				i--;
				j--;
			}else {
				if(t[i][j-1]>t[i-1][j]) {
					j--;
				}else {
					i--;
				}
			}
		}
		String s = sb.reverse().toString();
        int delS1 = deleteToMakeLCS(s1, s);
        int delS2 = deleteToMakeLCS(s2, s);
        return delS1+delS2;
    }
    public static int deleteToMakeLCS(String s, String lcs) {
        int sumOfDeletedChars = 0;

        // Create a set of characters in the LCS
        HashSet<Character> lcsChars = new HashSet<>();
        for (char ch : lcs.toCharArray()) {
            lcsChars.add(ch);
        }

        // Calculate the sum of ASCII values of characters not in the LCS
        for (char ch : s.toCharArray()) {
            if (!lcsChars.contains(ch)) {
                sumOfDeletedChars += (int) ch;
            }
        }

        return sumOfDeletedChars;
    }
}
