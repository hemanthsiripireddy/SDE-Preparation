package week8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import week6.ListNode;

public class SortLinkedListt {
	 public static ListNode sortList(ListNode head) {
	        List<Integer>list=new ArrayList<>();
	        ListNode node=head;
	        while(node!=null){
	            list.add(node.val);
	            node=node.next;

	        }
	        Collections.sort(list);
	        ListNode dumy=new ListNode(34);
	        node=dumy;
	        for(int i:list){
	            node.next=new ListNode(i);
	            node=node.next;

	        }
	        return dumy.next;
	        
	    }

}
