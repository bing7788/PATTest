package offer;

import java.util.ArrayList;

public class reOrderArray {
	
	public static void reOrderArray(int [] array) {
        ArrayList<Integer> list1 = new ArrayList();
        ArrayList<Integer> list2 = new ArrayList();
        int j =0;
        for(int i=0; i<array.length; i++){
        	if(array[i]%2==0){
        		list2.add(array[i]);
        	}else{
        		list1.add(array[i]);
        	}
        }
        while(!list1.isEmpty()){
        	array[j] = list1.remove(0);
        	j++;
        }
        while(!list2.isEmpty()){
        	array[j] = list2.remove(0);
        	j++;
        }
        
        for(int item:array){
        	System.out.println(item);
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {6,7,8,3,2,10,11,12,13,14};
		reOrderArray(array1);
	}

}
