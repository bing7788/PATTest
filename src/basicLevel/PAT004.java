package basicLevel;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;

public class PAT004 {
	
	
	public static void matchStr(String str1, String str2) {
		
		//�������
		char [] charArray1;
		char [] charArray2;
		String bigChar;
		char time;
		int temp = 0;
		
		
		charArray1 = str1.toCharArray();
		charArray2 = str2.toCharArray();
		
		Map<String,Character> map = new  HashMap<String,Character>();
		map.put("MON", 'A');
		map.put("TUE", 'B');
		map.put("WED", 'C');
		map.put("THU", 'D');
		map.put("FRI", 'E');
		map.put("SAT", 'F');
		map.put("SUN", 'G');
		
		Map<Integer,Character> map1 = new  HashMap<Integer,Character>();
		map1.put(10, 'A');
		map1.put(11, 'B');
		map1.put(12, 'C');
		map1.put(13, 'D');
		map1.put(14, 'E');
		map1.put(15, 'F');
		map1.put(16, 'G');
		map1.put(17, 'H');
		map1.put(18, 'I');
		map1.put(19, 'J');
		map1.put(20, 'K');
		map1.put(21, 'L');
		map1.put(22, 'M');
		map1.put(23, 'N');
			
		for (int i = 0; i < charArray1.length; i++) {
			if( charArray1[i] >='A' && charArray1[i]<='Z') {
				for (int j = 0; j < charArray2.length; j++) {
					if(charArray1[i]==charArray2[j]) {
						bigChar = String.valueOf(charArray1[i]);
						
						//System.out.println("bigChar"+bigChar);
						//�������
						for(Map.Entry<String, Character> entry: map.entrySet()) {
							String value = entry.getValue().toString();
							if(value.matches(bigChar)) {
								System.out.print(entry.getKey().toString()+" ");
							}
						}
						temp = i;
						//System.out.println("temp1"+temp);
						j=charArray2.length;
						i=charArray1.length;
					}
				}
			}
		}
		//System.out.println("temp2"+temp);
		
		//ƥ��0~9��A~N������
		for (int i = temp+1; i < charArray1.length; i++) {
			for (int j = temp+1; j < charArray2.length; j++) {
				if(charArray1[i]==charArray2[j]) {
					time = charArray1[i];
					//System.out.println("(int)2"+(int)'2');
					//System.out.println("(int)9"+(int)'9');
					if(time>='A'&& time<='N') {
						for(Entry<Integer, Character> entry: map1.entrySet()) {
							char value = entry.getValue();
							if(value==time) {
								System.out.print(entry.getKey()+":");
								j=charArray2.length;
								i=charArray1.length;
							}
						}
					}else if((int)time>=47&&(int)time<=57) {
						//char���͵�����0~9��ת����int���͵���47~57֮��
						System.out.print("0"+charArray1[i]+":");
						j=charArray2.length;
						i=charArray1.length;
					}
				}
			}
		}	
	}
	
	//����
	public static void time(String str1, String str2) {
		
		char [] charArray1 = str1.toCharArray();
		char [] charArray2 = str2.toCharArray();
		
		//ƥ�����Ƶ���ĸ����ȷ������λ��
		for (int i = 0; i < charArray1.length; i++) {
			//int m = (int)charArray1[i];
			if(charArray1[i]==charArray2[i]) {
			if((charArray1[i]>='a'&&charArray1[i]<='z')||(charArray1[i]>='A'&&charArray1[i]<='Z')) {
				
				if(i<10)
					System.out.print("0"+i);
				else
					System.out.print(i);
				//System.out.println("charArray1[i]"+charArray1[i]);
				//System.out.println("charArray2[i]"+charArray2[i]);
				i=charArray1.length;
			}
		}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		String str1 = reader.nextLine();
		String str2 = reader.nextLine();
		String str3 = reader.nextLine();
		String str4 = reader.nextLine();
		matchStr(str1,str2);
		time(str3,str4);
	}

}
