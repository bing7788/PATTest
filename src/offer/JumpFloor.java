package offer;

//抽象化算法有问题
public class JumpFloor {
	
	public static int JumpFloor(int target) {
		int result = 0;
		if(target>1){
		if(target%2==1){
			int n = (int)Math.pow(2,Math.floor(target/2));
			result = 2*n+1;
		}else{
		  result = (int)Math.pow(2,Math.floor(target/2));
		}}else{
			result =1;
		}
		
        return result;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
