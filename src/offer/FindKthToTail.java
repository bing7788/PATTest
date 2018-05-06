package offer;

import java.util.HashMap;

public class FindKthToTail {
	
	public static ListNode FindKthToTailMethod(ListNode head,int k) {
		if(head == null) return head;
        ListNode node = head;
        int count = 0;
        while (node != null) {
            count++;
            node = node.next;
        }
        if (count < k)  return null;
 
        ListNode p = head;
        for (int i = 0; i < count - k; i++) {
            p = p.next;
        }
        return p;
    }
    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
