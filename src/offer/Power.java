package offer;

public class Power {
		
	public static double Power1(double base, int exponent) {
        double result = 1.0;
        if(exponent>0){
        for(int i=0; i<exponent; i++){
            result *= base;
        }
        }else if(exponent==0){
        	result = 1;
        }else{
        	double temp = 1/base;	
        	for(int i=0; i<-exponent; i++){
                result *= temp;
            }
        }
        
        return result;
  }

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Power1(2, -3));
		
	}

}
