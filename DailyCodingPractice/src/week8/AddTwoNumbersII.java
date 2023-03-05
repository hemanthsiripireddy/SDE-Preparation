package week8;

import week6.ListNode;

public class AddTwoNumbersII {
	int carry=0;
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int l1s=0,l2s=0;
        ListNode node=l1;
        while(node!=null){
            l1s++;
            node=node.next;
        }
        node=l2;
        while(node!=null){
            l2s++;
            node=node.next;

        }
        ListNode node1=l1,node2=l2;
        if(l1s>l2s){
            int dif=l1s-l2s;
            while(dif>0){
                node1=node1.next;
                dif--;
            }

        }else{
            int dif=l2s-l1s;
            while(dif>0){
                node2=node2.next;
                dif--;
            }
        }
        ListNode dummy=new ListNode(6);
        node=dummy;
        rec(node1,node2,node);
        if(l1s>l2s){
            rec2(l1,node,l1s-l2s);
        }else if(l2s>l1s){
            rec2(l2,node,l2s-l1s);
        }
        if(carry==1){
             ListNode temp=new ListNode(carry);
            temp.next=node.next;
            node.next=temp;

        }
        return dummy.next;
        
    }
    public void rec2(ListNode node1,ListNode node,int dif){
        if(dif<=1){
             int val=node1.val+carry;

            ListNode temp=new ListNode(val%10);
            temp.next=node.next;
            node.next=temp;
            carry=val/10;
            return;

        }
        rec2(node1.next,node,dif-1);
         int val=node1.val+carry;

            ListNode temp=new ListNode(val%10);
            temp.next=node.next;
            node.next=temp;
            carry=val/10;
    }
    public void rec(ListNode node1,ListNode node2, ListNode node){
        if(node1.next==null){
            int val=node1.val+node2.val+carry;

            ListNode temp=new ListNode(val%10);
            temp.next=node.next;
            node.next=temp;
            carry=val/10;
            return;

        }
        rec(node1.next,node2.next,node);
         int val=node1.val+node2.val+carry;

            ListNode temp=new ListNode(val%10);
            temp.next=node.next;
            node.next=temp;
            carry=val/10;

    }

}
