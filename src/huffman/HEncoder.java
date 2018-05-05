package huffman;

import java.util.Comparator;
import java.util.HashMap;

public class HEncoder {
	
	public HashMap<Character, String> encoder = new HashMap<>();
	public HashMap<Character, String> decoder = new HashMap<>();
	
	private static class Node{
		Character ch;
		Integer freq;
		Node left;
		Node right;
		
		public static final Nodecomparator Ctor = new Nodecomparator();
		
		public static class Nodecomparator implements Comparator<Node>{

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return o2.freq - o1.freq;
			}
			
		}
	}
	
	public HEncoder(String feeder){
		//1. freq map
		HashMap<Character, Integer> freqmap = new HashMap<>();
		for(int i = 0;i< feeder.length(); ++i){
			char ch = feeder.charAt(i);
			if(freqmap.containsKey(ch)){
				freqmap.put(ch, freqmap.get(ch)+1);
			}else{
				freqmap.put(ch, 1);
			}
		}
	}
	
	
	
	

}
 