package basicLevel;

import java.util.Scanner;

/*
 * 
 * A+B>C
 * */

public class PAT001 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
        int T = reader.nextInt();
        long [][] s = new long[3][T];
        int i = 1;
        do{
            long scA = reader.nextLong();
            long scB = reader.nextLong();
            long scC = reader.nextLong();
            if(scA+scB>scC)
                System.out.println("Case #"+i+": "+true);
            else{
                System.out.println("Case #"+i+": "+false);
            }
            i++;
        }while(i<=T);
	}

}
