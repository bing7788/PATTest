package net_easy;

import java.util.Scanner;

public class ReverseNum {
	
	public static int Reversefunction(int number){
		int result = 0;
		int count = 0;
		Integer In = new Integer(number);
		String str = In.toString();
		char [] chararr = str.toCharArray();
		int length = chararr.length;
		char [] chararr1 = new char[length] ;
		for(int i=length-1;i>=0;i--){
			
			if (chararr[length-1] == '0'&&chararr[i]=='0') {
				count++;
			} else {
				chararr1[length - i - 1-count] = chararr[i];
			}
		}
		char[] chararr2 = new char[length-count];
		for(int j=0;j<length-count;j++){
			chararr2[j]=chararr1[j];
		}
		
		String str1=new String(chararr2);
		//System.out.println(str1);
		int result1 = Integer.valueOf(str1).intValue();
		result = result1+number;
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		int result = Reversefunction(number);
		System.out.println(result);
	}

}
