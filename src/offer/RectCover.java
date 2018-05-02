package offer;

public class RectCover {
	
	 public static int RectCover(int target) {
		 
      if(target<1){
    	  return 0;
      }else if(target==1||target ==2){
    	  return target;
      }else{
    	  return RectCover(target-1)+RectCover(target-2);
      }
		 
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
