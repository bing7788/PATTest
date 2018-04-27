package test;

public class Arraytest {
	
	public static int aMethod(int i)throws Exception
    {
        try{
            return i/10;
        }
        catch (Exception ex)
        {
            throw new Exception("exception in a aMethod");
        }finally{
        		System.out.printf("finally");
        }
	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
        {
            aMethod(0);
        }
        catch (Exception ex)
        {
            System.out.printf("exception in main");
        }
        System.out.printf("finished");
	}
}
