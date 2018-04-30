package baidu;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class ThirdPrice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int [] array = new int[num];
		int count = 0;
		
		for(int i=0;i<num;i++){
			array[i]=reader.nextInt();
		}
		
		Arrays.sort(array);
		
		HashSet<Integer> hashSet = new HashSet<>();
		
		for(int i=0;i<array.length;i++){
			hashSet.add(array[i]);
		}
		
		Iterator it = hashSet.iterator();
		while(it.hasNext()){
			count++;
			System.out.println(it.next());
			/*
			if(count==3){System.out.println(it.next());
			break;
			}*/
		}
		if(count<3){
			System.out.println(-1);
		}	
	}

}
