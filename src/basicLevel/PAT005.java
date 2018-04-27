package basicLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PAT005 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//首次输入的预定值
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		int lowerLine = reader.nextInt();
		int highLine = reader.nextInt();
		int count = 0;
		boolean flag = true;
		System.out.println("number"+number);
		System.out.println("lowerLine"+lowerLine);
		System.out.println("highLine"+highLine);
		//根据输入的值来确定创建容器的大小
		Map<Integer,Integer> scoreMap = new HashMap<Integer,Integer>();
		Map<Map<Integer,Integer>,Long> numMap = new HashMap<Map<Integer,Integer>,Long>();
		while(flag) {
			long cardID = reader.nextInt();
			int dscore = reader.nextInt();
			int cscore = reader.nextInt();
			scoreMap.put(dscore, cscore);
			numMap.put(scoreMap, cardID);
			count++;
			if(count>=number)flag=false;
		}
		
		for(Map.Entry<Map<Integer,Integer>, Long> entry: numMap.entrySet()) {
			Map<Integer,Integer> tempMap = new HashMap<Integer,Integer>();
			//System.out.println(tempMap.);
		}
		
	}

}
