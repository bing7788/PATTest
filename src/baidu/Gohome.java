package baidu;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//用HashMap
public class Gohome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		boolean flag = false;
		List<Integer> list = new ArrayList<>();
		
		for(int i=0;i<num;i++){
			list.add(reader.nextInt());
		}
		
		int start = list.get(0);
		int stop = list.get(num-1);
		int count =0;
		int [] array = new int[num-2];
		if(num>=4){
		for(int i=0; i<num-2;i++){
			array[i] = Math.abs(start-list.get(i+1))+Math.abs(stop-list.get(i+1));
			
			if(list.get(i+1)>Math.min(start, stop)&&list.get(i+1)<Math.max(start, stop)){
				count++;
			}
		}
		if(count==num-2)flag=true;
		Arrays.sort(array);
		if(flag==true){
			System.out.println(Math.max(start, stop)-Math.min(start, stop));
		}
		else{
			int sum = 0;
			for(int i=0;i<num-3;i++){
				sum =sum+array[i];
			}
			System.out.println(sum);
			}		
		}else{
			System.out.println(list.get(num-1)-list.get(0));
		}
	}

}
