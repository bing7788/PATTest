package test;

public class BooleanArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		boolean [] barray = new boolean[5];
		for(boolean item: barray){
			System.out.println(item);
		}
		String s = "babad";
		System.out.println(s.length());*/
		int [][] DoubleArray = {{1,2,3},{4,5,6},{7,8,9},{10,11,12}};
		int rowLength = DoubleArray.length;
		int colLength = DoubleArray[0].length;
		for(int i=0;i<DoubleArray.length;i++){
			for(int j=0; j<DoubleArray[i].length;j++){
				System.out.println(DoubleArray[i][j]);
			}
		}	
	}

}
