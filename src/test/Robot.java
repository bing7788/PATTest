package test;

import java.util.Scanner;

public class Robot {
	
	public static void partition(int neednum){
		int result = 0;
		if(neednum%2==0&&neednum!=0){
			int num2 = (neednum-2)/2;
			result = 2;
			partition(num2);
		}else if(neednum%2==1&&neednum!=0){
			int num1 = (neednum-1)/2;
		    result = 1;
		    partition(num1);
		}
		if(result!=0)System.out.print(result);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int neednum0 = reader.nextInt();
	    partition(neednum0);
	}

}
