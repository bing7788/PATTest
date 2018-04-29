package net_easy;

import java.util.Scanner;

public class Sub_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		char[] charArray = str.toCharArray();
		int length = charArray.length;
		int max = 0;
		int count = 1;
		for(int i=0;i<length-1;i++){
			if(charArray[i]!=charArray[i+1]){
				count++;
			}else{
				if(max<count)max=count;
                count=1;
			}
			if(max<count)max=count;
		}
		System.out.println(max);
	}
}
