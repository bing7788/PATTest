package net_easy;

import java.util.Scanner;

public class IndependenceYi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int x = reader.nextInt();
		Long f = reader.nextLong();
		Long d = reader.nextLong();
		int p = reader.nextInt();
		if(f>=d/x){
			System.out.println(d/x);
		}else{
			int days = (int) ((d+f*p)/(p+x));
			System.out.println(days);
		}
		
	}

}
