package offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReplaceSpace {
	
	
	public static String replaceSpace(StringBuffer str){
		String result = null;
		char insert0 = '%';
		char insert1 = '2';
		char insert2 = '0';
		StringBuffer strResult = new StringBuffer();
		char [] charArray = str.toString().toCharArray();
		List<Character> array = new ArrayList<Character>();
		
		//1.替换空格
		for(int i=0;i<charArray.length;i++){	
			if(charArray[i]==' '){
				array.add(insert0);
				array.add(insert1);
				charArray[i]=insert2;
				
			}
			array.add(charArray[i]);
		}
		
		//2.转换结果
		for(int i=0; i<array.size();i++){
			
			strResult.append(array.get(i));
		}
		result = strResult.toString();
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		str.append(reader.nextLine());
		String result=replaceSpace(str);
		System.out.print(result);
	}

}
