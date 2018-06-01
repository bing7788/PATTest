package reflection;

public class Test {

    public static int num = 1 << 30;

    public static void main(String[] args) throws ClassNotFoundException {

        //command+option+/
       /* Class clazz = null;
        String className = "reflection.Person";
        clazz = Class.forName(className);*/
       System.out.println("num"+num);
       Integer num1 = new Integer(num);
    }
}
