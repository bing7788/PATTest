package net_easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
//时间复杂度太大 AC=50%
public class Breversequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.输入
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
	    Integer[] array = new Integer[num];
	    for(int i=0; i<num; i++){
	    	array[i] = reader.nextInt();
	    }
	    List<Integer> data = new ArrayList<Integer>();
	    
	    for(int i=0; i<num; i++){
	    	data.add(array[i]);
	    	Collections.reverse(data);
	    }
	    
	    for(int i=0;i<num-1;i++){
	    	System.out.print(data.get(i));
	    	System.out.print(" ");
	    }
	    System.out.print(data.get(num-1));
	}

}
