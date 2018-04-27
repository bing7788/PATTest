package basicLevel;

import java.util.Scanner;

public class PAT002 {
	
	//A1����
	public static int A1(int [] args) {
		int sum = 0;
		for (int i = 0; i < args.length; i++) {
			if(args[i]%10==0) {
			   sum = sum+args[i];
			}
		}
		return sum;
	}
	
	//A2����
	public static int A2(int [] args) {
		int sum = 0;
		int count = 0;
		for (int i = 0; i < args.length; i++) {
			if(args[i]%5==1) {
					//����-1��ż���η��Ķ���ӵĲ��ֽ��з��ŵ�ת��
				   sum = (int) (sum+args[i]*Math.pow(-1, count)); 
				   count++;
				}
		}
		return sum;
	}
	
	//A3�����������ʱ����Ҫ�ж���͵�ֵ�Ƿ�Ϊ��
	public static int A3(int [] args) {
		int count = 0;
		for (int i = 0; i < args.length; i++) {
			if(args[i]%5==2) {
				count++;
			}
		}
		return count;
	}
	
	//A4����,���ʱ����Ҫ�������λ��
	public static double A4(int [] args) {
		double avg = 0;
		double sum =0;
		double count = 0;
		//��ʽ������Ĳ�����String����
		//DecimalFormat df = new DecimalFormat();
		//df.setMaximumFractionDigits(1);
		for (int i = 0; i < args.length; i++) {
			if(args[i]%5==3) {
				sum = sum + args[i];
				count++;
			    avg = sum/count;
			}
		}
		return avg;
	}
	
	public static int A5(int[] args) {
		int maxNum = 0;
		for (int i = 0; i < args.length; i++) {
			if(args[i]%5==4&&maxNum<args[i]) {
				maxNum = args[i];
			}
		}	
		return maxNum;
	}
	
	//�������
	public static void printArray(int [] args) {
		for (int i = 0; i < args.length; i++) {
			if(args[i]==0)
			System.out.print("N ");
			else
			System.out.print(args[i]);
		}
	}
	
	public static void printint(int number) {
		if(number==0)
			System.out.print("N ");
			else
			System.out.print(number+" ");
		
	}
	
	 public static void printintlast(int number) {
			if(number==0)
				System.out.print("N");
				else
				System.out.print(number);
			
		}
	 
	public static void printdouble(double number) {
		if(number==0)
			System.out.print("N ");
			else {
				System.out.format("%.1f",number);
				System.out.print(" ");	
			}
			
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.��������
		Scanner reader = new Scanner(System.in);
		int count = reader.nextInt();
		int [] array = new int[count];
		int [] outarray = new int[5];
		int i = 0;
		do {
			int enumArray = reader.nextInt();
			array[i] = enumArray;
			i++;
		}while(i<count);
		//System.out.println(count);
		printint(A1(array));
		printint(A2(array));
		printint(A3(array));
		printdouble(A4(array));
		printintlast(A5(array));		
	}

}
