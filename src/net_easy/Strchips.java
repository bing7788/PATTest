package net_easy;
/*
һ����Сд��ĸ��ɵ��ַ������Կ���һЩͬһ��ĸ�������Ƭ��ɵġ�����,"aaabbaaac"����������Ƭ��ɵ�:'aaa','bb','c'��ţţ���ڸ���һ���ַ���,���������������ַ�����������Ƭ��ƽ�������Ƕ��١�

��������:
�������һ���ַ���s,�ַ���s�ĳ���length(1 �� length �� 50),sֻ��Сд��ĸ('a'-'z')


�������:
���һ������,��ʾ������Ƭ��ƽ������,�������뱣����λС����

��������ʾ: s = "aaabbaaac"
������Ƭ��ƽ������ = (3 + 2 + 3 + 1) / 4 = 2.25

��������1:
aaabbaaac

dccbbbbebeacdbbbbdbaaaabbeeeeaaddeeeeaabbbeeecdccc

�������1:
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
		//ǰ���ظ��ĸ���ͳ��
		int count0 =0;
		//��ӵ�ͳ��
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
