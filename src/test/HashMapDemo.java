package test;

import java.util.*;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.普遍使用,通过遍历keySet获得值
		HashMap<Integer,String> map = new HashMap<Integer, String>();
		//HashSet e = new HashSet();
		//Iterable
		//ListIterator
		//HashTable<K,V> hashtable = new Hashtable<K,V>();
		TreeSet
		map.put(1,"value1");
		map.put(2,"value2");
		map.put(3,"value3");

		System.out.println("通过Map.keySet遍历key和value：");
		for(Integer key: map.keySet()){
			System.out.println("key="+key+" and value ="+map.get(key));
		}

		//2.通过Map.entrySet使用iteration遍历key和value
		Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
		while (it.hasNext()){
			Map.Entry<Integer,String> entry = it.next();
			System.out.println("key="+entry.getKey()+" and value ="+entry.getValue());
		}

		//3.推荐，尤其是容量大时
		System.out.println("-----通过Map.entrySet遍历key和value-----");
		for(Map.Entry<Integer,String> entry:map.entrySet()){
			System.out.println("key="+entry.getKey()+" and value ="+entry.getValue());
		}

		//4.遍历value
		System.out.println("-----通过Map遍历value-----");
		for(String v: map.values()){
			System.out.println("value"+v);
		}
	}

}
