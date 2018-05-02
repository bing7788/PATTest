package offer;

public class Fibonacci {
	
	public static int Fibonacci(int n) {
		int result = 0;
		if(n>1){
       int [] f = new int[n];
       f[0]=f[1]=1;
       
       if(n==1||n==2){
           result = f[n-1];
       }else{
    	   //System.out.print(f[n-1]);
    	   for(int i=0;i<n-2;i++){
    	   f[i+2]=f[i+1]+f[i];
       }
       //System.out.print(f[n-1]);
       result=f[n-1];
    	}
		}else if(n==1){
			result =1;
		}else{
			result=0;
		}
       /*
       for(int item:f){
    	   System.out.println(item);
       }
       */
		//System.out.println(result);
       return result;
   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonacci(1);
	}

}
