package linkedList;

public class IntersectionOfTwoLinkedLists {
	public static void method() {
		Node head1=null,head2=null;
		Node intersection= intersection(head1,head2);
	}

	private static Node intersection(Node head1, Node head2) {
		// TODO Auto-generated method stub
		//int h1=0,h2=0;
		if(head1==null||head2==null)
			return null;
		
		int h1=0,h2=0;
		Node node=head1;;
		while(node!=null) {
			h1++;
			node=node.next;
		}
		node =head2;
		while(node!=null) {
			h2++;
			node=node.next;
		}
		if(h1>h2) {
			return helper(head1,h1,head2,h2);
		}
		else {
			return helper(head2,h2,head1,h1);
			
		}
	
	}

	private static Node helper(Node head1, int h1, Node head2, int h2) {
		// TODO Auto-generated method stub
		int dif=h1-h2;
		while(dif>0) {
			head1=head1.next;
			dif--;
		}
		while(head2!=null) {
			if(head1==head2)return head1;
			head1=head1.next;
			head2=head2.next;
		}
		return null;
	}

}
