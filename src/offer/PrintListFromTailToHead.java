package offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

class ListNode{
	int val;
	ListNode next = null;
	
	ListNode(int val){
		this.val = val;
	}
}

class MyLinkedList{
	public ListNode head;
	public ListNode current;
	
	//1.增加链表节点
	public void add(int data){
		if(head == null){
			head = new ListNode(data);
			current = head;
		}else{
			current.next = new ListNode(data);
			current = current.next;
		}
	}
	
	//2.打印链表
	public void print(ListNode listNode){
		if(listNode == null){
			return;
		}
		current = listNode;
		while(current!=null){
			System.out.print(current.val);
			current = current.next;
		}
	}
	
	
}


public class PrintListFromTailToHead {
	
	public static ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		
		Scanner reader = new Scanner(System.in);
		ListNode listNextNode = new ListNode(reader.nextInt()); 
		listNode.next = listNextNode;
			
		//将获取到的数据放入到ArrayList中
		ArrayList<Integer> list = new ArrayList<Integer>();
		while(listNode!=null){
        	list.add(listNode.val);
        }
		Collections.reverse(list);
		
		//打印
		return list;
    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner reader = new Scanner(System.in);
		MyLinkedList myLinkList = new MyLinkedList();
		
		myLinkList.add(reader.nextInt());
	}

}
