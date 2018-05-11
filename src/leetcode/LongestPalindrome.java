package leetcode;

public class LongestPalindrome {
	
	public static String longestPalindrome(String s){
		char[] in = s.toCharArray();
		int stringlen = s.length();
		boolean[][] len = new boolean[stringlen][stringlen];
		int start = 0;
		int end = 0;
		
		for(int i=0; i<stringlen; i++){
			for(int j=0; j<stringlen-i;j++){
				if(i == 0){
					len[j][i] = true;
				}else if(i==1){
					if(in[j] == in[j+1]){
						len[j][j+1] =true;
					}
				}else{
					if(in[j] == in[j+i]&&len[j+1][j+i-1]){
						len[j][j+i] = true;
					}
				}
				if(len[j][j+i] == true){
					start = j;
					end = j+i;
				}
			}
		}
		return s.substring(start, end+1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
