package baidu;

import java.util.Arrays;
import java.util.Scanner;

public class ThiedPrice_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int [] array = new int[num];
		int count = 1;
		
		for(int i=0;i<num;i++){
			array[i]=reader.nextInt();
		}
		Arrays.sort(array);
		for(int i=0;i<num-1;i++){
			if(array[i]!=array[i+1]){
				count++;
				if(count==3){
					System.out.println(array[i+1]);
					break;
				}
			}
		}
		if(count<3)System.out.println(-1);
	}

}
