package test;


//instanceof和getClass的区别
public class ClassTest {
	
	public static void testInstanceof(Object x){
		System.out.println("x instanceof Parent:"+(x instanceof Parent));
		System.out.println("x instanceof Child:" +(x instanceof Child));
		System.out.println("x getClass Parent:"+(x.getClass() == Parent.class));
		System.out.println("x getClass Child:"+(x.getClass() == Child.class));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInstanceof(new Parent());
		System.out.println("--------------");
		testInstanceof(new Child());
	}
}

class Parent{
	
}

class Child extends Parent{
	
}