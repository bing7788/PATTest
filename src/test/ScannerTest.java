package test;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner read = new Scanner(System.in);
		int n = read.nextInt();
		int[] nums = new int[n];
		for(int i=0;i<n;i++) {
			nums[i]=read.nextInt();
		}
		int k = read.nextInt();
		int d = read.nextInt();
		
		System.out.println(n);
		for(int x:nums) {
			System.out.println(x);
		}
		System.out.println(k);
		System.out.println(d);
	}

}
