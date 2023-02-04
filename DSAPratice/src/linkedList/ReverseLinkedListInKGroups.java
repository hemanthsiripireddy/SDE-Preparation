package linkedList;

public class ReverseLinkedListInKGroups {
	public static void method() {
		int[] arr=new int[] {1,2,3,4,5};
		int k=3;
		 Node head=formLinkedList(arr);
		 //head=revserLinkedListBruteForce(head);
		head=reverseLinkedListKgroup(head,k);
		 while(head!=null) {
			 System.out.print(head.val+" ");
			 head=head.next;
			 
		 }
		
	}
	private static Node reverseLinkedListKgroup(Node head,int k) {
		// TODO Auto-generated method stub
		if(k<2)
			return head;
		Node p1=head,p2=head,prev=head;
		head=null;
		while(p1!=null) {
			p1=p2;
			int count=1;
			while(p2!=null&&count<=k) {
				p2=p2.next;
				count++;
			}
			count--;
			if(count<k)
				break;
			if(head==null) {
				head=reverseLinkedList(p1,k);
			}else {
				prev.next=reverseLinkedList(p1,k);
			}
			prev=p1;
			//p1=p2;
			
			
			
		}
		return head;
	}
	private static Node reverseLinkedList(Node head,int k) {
		// TODO Auto-generated method stub
		if(head==null)return head;
		int count=1;
		Node cur=head,prev=null;
		while(cur!=null&&count<=k) {
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
			count++;
		}
		head.next=cur;
		
		
		return prev;
	}
	private static Node formLinkedList(int[] arr) {
		// TODO Auto-generated method stub
		Node head=new Node(arr[0]);
		Node node=head;
		for(int i=1;i<arr.length;i++) {
			node.next=new Node(arr[i]);
			node=node.next;
		}
		return head;
	}

}
