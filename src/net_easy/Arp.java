package net_easy;

import java.util.Arrays;
import java.util.Scanner;

public class Arp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int [] inputarray = new int[num];
		for(int i=0; i<num; i++){
			Scanner reader1 = new Scanner(System.in);
			inputarray[i]=reader1.nextInt();
		}
		Arrays.sort(inputarray);
		int d = inputarray[1]-inputarray[0];
		boolean flag = true;
		for(int i=2; i<inputarray.length; i++){
			if(inputarray[i]-inputarray[i-1]!=d){
				flag = false;
			}
		}
		if(flag){
			System.out.println("Possible");
		}else{
			System.out.println("Impossible");
		}
	}

}
