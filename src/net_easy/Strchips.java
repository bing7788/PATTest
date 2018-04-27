package net_easy;
/*
一个由小写字母组成的字符串可以看成一些同一字母的最大碎片组成的。例如,"aaabbaaac"是由下面碎片组成的:'aaa','bb','c'。牛牛现在给定一个字符串,请你帮助计算这个字符串的所有碎片的平均长度是多少。

输入描述:
输入包括一个字符串s,字符串s的长度length(1 ≤ length ≤ 50),s只含小写字母('a'-'z')


输出描述:
输出一个整数,表示所有碎片的平均长度,四舍五入保留两位小数。

如样例所示: s = "aaabbaaac"
所有碎片的平均长度 = (3 + 2 + 3 + 1) / 4 = 2.25

输入例子1:
aaabbaaac

dccbbbbebeacdbbbbdbaaaabbeeeeaaddeeeeaabbbeeecdccc

输出例子1:
2.25
*/

import java.text.DecimalFormat;
import java.util.Scanner;

public class Strchips {
	public static double countstr(String str){
		double result=0;		
		char [] chararr = str.toCharArray();
		int [] num = new int[chararr.length];
		int pivot = 0;
		//前后重复的个数统计
		int count0 =0;
		//添加的统计
		int count1 =0;
		double sum =0;
		double count2 =0;
		for(int i=0; i<chararr.length;i++){
			if(chararr[pivot]==chararr[i]&&pivot==chararr.length-1){
				count0++;
				num[count1]=count0;
			}else if(chararr[pivot]==chararr[i]){
				count0++;
			}else{
				num[count1]=count0;
				count1++;
				count0 = 0;
				pivot = i;
				i = i-1;
			}
		}
		for(int item:num){
			if(item!=0){
				sum = sum+item;
				count2++;
			}
		}
		result=sum/count2;
		DecimalFormat fnum = new DecimalFormat("#0.00");
		System.out.println(fnum.format(result));
		return result;			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String str = reader.nextLine();
		countstr(str);
	}

}
