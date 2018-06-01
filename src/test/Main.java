package test;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//1.录入信息
		Scanner reader = new Scanner(System.in);
		String start = reader.nextLine();
		String [] startArray = start.split(" ");
		String stop = reader.nextLine();
		String [] stopArray = stop.split(" ");
		
		int row = reader.nextInt();
		int col = reader.nextInt();
		int [][] array = new int[row][col];
		for(int i=0;i<row;i++){
			for(int j=0;j<col;j++){
				array[i][j]=reader.nextInt();
			}
		}
		
		//2.计算
		int start0 = Integer.parseInt(startArray[0]);
		int start1 = Integer.parseInt(startArray[1]);
		
		int stop0 = Integer.parseInt(stopArray[0]);
		int stop1 = Integer.parseInt(stopArray[1]);
		
	
		
		
		
		
	}
	

}
