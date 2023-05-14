package trees;

public class HeightOfBinaryTree {
	public static void method() {
		Node root=new Node(1);
		root.left=new Node(2);
		root.rigth=new Node(3);
		root.rigth.left=new Node(4);
		int h=findHeght(root);
		System.out.println(h);
	}
	public static int findHeght(Node root) {
		if(root==null)
			return -1;
		int left=findHeght(root.left);
		int right=findHeght(root.rigth);
		return Math.max(left, right)+1;
					
	}

}
