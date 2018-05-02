package offer;

import java.util.Stack;

public class NumberOf1 {
	
	public static int NumberOf1(int n) {
	
		int result =0;
		int flag = n;
		if(n<0)n=-n;
		//1.求出正整数的源码
		Stack<Integer> stack = new Stack<Integer>();
		while(n/2>0){
			stack.add(n%2);
			n=n/2;
		}
		stack.add(1);
		
		int length = stack.size();
		int [] array = new int[8];
		//System.out.println(length);
		int start =0;
		if(length>0&&length<=8){
			start = 8-length;
		}else if(length>8&&length<=16){
			start = 16-length;
		}else{
			start = 32-length;
		}
		
		int i=start;
		//2.逆序输出
		while(!stack.empty()){
			int num = stack.pop();
			if(flag>0&&num==1){
				result++;}
			//反码
			array[i]=num;
			i++;
		}
		
		//3.取反
		if(flag<0){
		for(int k=0;k<8;k++){
			if(array[k]==0){
				array[k]=1;
			}else{
				array[k]=0;
			}
		}
		//4.负整数补码处理
		if(array[7]!=0){
			array[7]=array[7]+1;
			for(int j=7;j>=0;j--){
				if(array[j]==2){
					array[j]=0;
					array[j-1]=array[j-1]+1;
				}
			}
		}
		for(int item:array){
			//System.out.print(item);
			if(item==1)result++;
		}
		}
		//System.out.println(result);
	return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NumberOf1(214748367);
	}

}
