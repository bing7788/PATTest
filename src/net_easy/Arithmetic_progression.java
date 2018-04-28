package net_easy;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 1.输入函数(数组大小、具体的数组内容)
 * 2.排序函数
 * 3.验证等差规则函数
 * 4.输出函数
 * */

public class Arithmetic_progression {
	
	//1.输入数组
	public static int[] inputFunction(int num){
		int [] inputarray = new int[num];
		for(int i=0; i<num; i++){
			Scanner reader = new Scanner(System.in);
			inputarray[i]=reader.nextInt();
		}
		Arrays.sort(inputarray);
		return inputarray;
	}	
	//输出函数
	public static void outputFunction(int[] array){
		int d = array[1]-array[0];
		boolean flag = true;
		for(int i=2; i<array.length; i++){
			if(array[i]-array[i-1]!=d){
				flag = false;
			}
		}
		if(flag){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}
			
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int[] array = inputFunction(num);
		outputFunction(array);
	}

}
