package test;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
    	if(o instanceof Person){
			Person p = (Person) o;
			return name.equals(p.name) && age==p.age;
		}
		return false;
    }

    @Override
    public int hashCode() {

        return name.hashCode()+age;
    }
}

public class HashSetDemo {

    public static void main(String[] args){
        Set<Person> set = new HashSet<Person>();
        set.add(new Person("bing",24));
        set.add(new Person("bing",25));
        set.add(new Person("bing12",241));
        System.out.println(set);
    }
}