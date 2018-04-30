package offer;

import java.util.ArrayList;
import java.util.Stack;

public class PrintListFromTailToHead1 {
	
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        Stack<Integer> stack = new Stack<>();
        while (listNode != null) {
            stack.push(listNode.val);
            listNode = listNode.next;
        }
 
        ArrayList<Integer> list = new ArrayList<>();
        while (!stack.isEmpty()) {
            list.add(stack.pop());
        }
        return list;       
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
