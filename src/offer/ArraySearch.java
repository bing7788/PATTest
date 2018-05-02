package offer;

import java.util.Arrays;

public class ArraySearch {
	
	public static int minNumberInRotateArray(int [] array) {
        int result=0;
        if(array.length!=0){
		Arrays.sort(array);
		result = array[0];
		}else{
			result = 0; 
		}
		return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
