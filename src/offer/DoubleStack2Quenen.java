package offer;


import java.util.LinkedList;
import java.util.Stack;

public class DoubleStack2Quenen {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	LinkedList<Integer> list = new LinkedList<Integer>();
	
	public void push(int node){
		stack1.push(node);
	}
	
	public int pop(){
		
		while(!stack1.empty()){
			int num = stack1.remove(0);
			list.add(num);
		}
		if(list.size()!=0){stack2.push(list.remove(0));}
		int element = stack2.pop();
		return element;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DoubleStack2Quenen dsq = new DoubleStack2Quenen();
		dsq.push(1);
		dsq.push(2);
		dsq.push(3);
		System.out.print(dsq.pop());
		System.out.print(dsq.pop());
		dsq.push(4);
		System.out.print(dsq.pop());
		dsq.push(5);
		System.out.print(dsq.pop());
		System.out.print(dsq.pop());
	}

}
