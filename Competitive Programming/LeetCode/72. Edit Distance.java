class Solution {
    public int minDistance(String s1, String s2) {
        int n = s1.length();
	    int m = s2.length();
	    int edit[][] = new int[n+1][m+1];
	    
	    int num = 0;
	    for(int i = n;i >= 0;i--){
	        edit[i][m] = num;
            num++;
	    }
	    num = 0;
	    for(int j = m;j >= 0;j--){
	        edit[n][j] = num;
            num++;
	    }
	    
	    for(int i = n-1;i >= 0;i--){
	        for(int j = m-1;j >= 0;j--){
	            if(s1.charAt(i) == s2.charAt(j)){
	                edit[i][j] = edit[i+1][j+1];
	            }
	            else{
	                edit[i][j] = (int)Math.min(edit[i+1][j],(int)Math.min(edit[i][j+1],edit[i+1][j+1]))+1;
	            }
	        }
	    }
        
	    return edit[0][0];
    }
}