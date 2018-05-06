package offer;

import java.util.ArrayList;

public class ReverseList {
	
	public static ListNode ReverseList(ListNode head) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(head.next!=null){
			list.add(head.val);
			head = head.next;
		}
		ListNode re = new ListNode(0);
		for(int i=list.size()-1;i>=0;i--){
			re.val=list.get(i);
			re = re.next;
		}
        return re;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
