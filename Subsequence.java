package dynamicProgramming;

public class Subsequence {
	public static String lcs(String s1,String s2,int m,int n,String dp[][]) {
		if(m==0||n==0) {
			return "";
		}
		if(dp[m][n]!="")return dp[m][n];
		
		 if (s1.charAt(m-1) == s2.charAt(n-1)) {
		      dp[m][n]=  lcs(s1, s2, m-1, n-1,dp)+s1.charAt(m-1);
		      return dp[m][n];
		    }
		 else {

//		       dp[m][n]= Math.max
		       if((lcs(s1, s2, m, n-1,dp).length()> lcs(s1, s2, m-1, n,dp).length())) {
		    	   dp[m][n]=lcs(s1, s2, m, n-1,dp);
		    			   return dp[m][n];
		       }
		       else {
		    	   dp[m][n]=lcs(s1, s2, m-1, n,dp);
		    	   return dp[m][n];  
		       }
		      
	}
	}

	public static void main(String[] args) {
		String str1="abc";
		String str2="abc";
		int m=str1.length();
		int n=str2.length();
		String dp[][]=new String[m+1][n+1];
		for(int i=0;i<=m;i++) {
			for(int j=0;j<=n;j++) {
				dp[i][j]="";
			}
		}
		System.out.println(lcs(str1,str2,m,n,dp));

	}

}
