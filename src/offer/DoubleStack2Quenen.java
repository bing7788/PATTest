package offer;

import java.util.Stack;

public class DoubleStack2Quenen {
	
	Stack<Integer> stack1 = new Stack<Integer>();
	Stack<Integer> stack2 = new Stack<Integer>();
	
	public void push(int node){
		stack1.push(node);
	}
	
	public int pop(){
		int element=0;	
		while(!stack1.empty()){
			int num = stack1.pop();
			//System.out.print(num);
			if(stack2.empty()){
			stack2.push(num);
			}else{
				while(!stack2.empty()){
					element=stack2.pop();
				}
				stack2.push(num);
			}
			//System.out.print(stack1.pop());
		}
		if(element==0){
		element = stack2.pop();}
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
