package reflection;

interface HasBatteries{}
interface Waterproof {}
interface Shoots {}
interface Schema {}

class Toy{
    Toy(){}
    Toy(int i){}
}


class FancyToy extends Toy implements HasBatteries,Waterproof,Shoots,Schema{
    FancyToy(){super(1);}
}

public class ToyTest {

    static void printInfo(Class cc){
        System.out.println("Class name:"+cc.getName()+" is interface？["+cc.isInterface()+"]");
        System.out.println("Simple name:"+cc.getSimpleName());
        System.out.println("Canonical name:"+cc.getCanonicalName());
        System.out.println("-------------------------");
    }

    public  static void main(String[] args){
        Class c = null;
            try {
                c=Class.forName("reflection.FancyToy");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();

            }
        printInfo(c);

        for(Class face: c.getInterfaces())
            printInfo(face);

        Class up = c.getSuperclass();
        Object obj = null;
        try {
            obj = up.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.print("obj.getClass()");

        printInfo(obj.getClass());
    }

}
