package basicLevel;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class PAT003 {

	//��������
	public static void isPrime(int M, int N){
        int pc = 1;
        boolean isPrime;
        int count = 0;
        for (int i = 1; i <= 1000000; i++) {
            isPrime = true;
            int k = (int) Math.sqrt(i);
            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                if (count >= M && count <= N) {
                    if(pc % 10 !=0 && pc!=N-M+1){
                    System.out.print(i);
                    pc++;
                    System.out.print(" ");

                    }else if(pc==N-M+1){
                        System.out.print(i);
                    }else {
                        System.out.print(i);
                        System.out.println();
                        pc++;
                    }
                }
                count++;
            }
            if (count > N) break;
        }
    }
	
	//map
	public static void mapfilter(int M, int N) {
		boolean isPrime;
		//����Ҫ�����������
		int primeCount = 1;
		//ѭ�����õ���������
		int count = 0;
		Map<Integer,Integer> mapData = new HashMap<Integer,Integer>();
		Iterator<Integer> iter = mapData.keySet().iterator();
		for (int i = 1; i <= 1000000; i++) {
            isPrime = true;
            int k = (int) Math.sqrt(i);
            for (int j = 2; j <= k; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
		
            if(isPrime) { 
               mapData.put(primeCount, i);
               //System.out.println("primeCount"+primeCount);
               System.out.println("i"+i);
               primeCount++;
               count++;   
			}
            
          if(count > N) break;
		}
		
		//��map���������
		
		while(iter.hasNext()) {
			Integer key = iter.next();
			int val = mapData.get(key);
			System.out.println("what?");
			if(M==N)
				System.out.println(mapData.get(M));
			else if(key%10==0)
				System.out.println(val);
			else {
				System.out.print(val);
				System.out.println(" ");
			}
		}
	}
	
	
	
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int M = reader.nextInt();
        int N = reader.nextInt();
        //isPrime(M,N);
        mapfilter(M,N);
    }

}
