package week7;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import week6.ListNode;

public class NextGreaterNodeInLinkedList {
	public static void method() {
		int[] arr= new int[] {2,1,5};
		ListNode head=formLinkedList(arr);
		int[] res=nextLargerNodes(head);
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]+" ");
		}
	}

	
	public static  int[] nextLargerNodes(ListNode head) {
        List<Integer>list=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            list.add(temp.val);
            temp=temp.next;
        }
        Stack<Integer>stack=new Stack<>();
        int[] res=new int[list.size()];
        for(int i=0;i<list.size();i++){
            while(stack.size()!=0&&list.get(i)>list.get(stack.peek())){
                res[stack.pop()]=list.get(i);
            }
            stack.push(i);

        }
        return res;
        
    }
	private static ListNode formLinkedList(int[] arr) {
		// TODO Auto-generated method stub

	// TODO Auto-generated method stub
		ListNode head=new ListNode(arr[0]);
		ListNode node=head;
		for(int i=1;i<arr.length;i++) {
			node.next=new ListNode(arr[i]);
			node=node.next;
		}
		return head;
	}
}
