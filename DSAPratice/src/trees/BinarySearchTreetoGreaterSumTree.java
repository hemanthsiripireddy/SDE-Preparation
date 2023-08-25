package trees;

public class BinarySearchTreetoGreaterSumTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {4,1,6,0,2,5,7,-1,-1,-1,3,-1,-1,-1,8};
		TreeNode root=FormTreeFromAList.build(arr);
		bstToGst(root);
		System.out.println("done");

	}
	 public static TreeNode bstToGst(TreeNode root) {
	        process(root,0);
	        return root;

	        
	    }
	    public static int process(TreeNode root,int val){

	        if(root==null)
	        return 0;
	        int right=process(root.right,0);
	        root.val+=(right+val);
	      int sum=  findSum(root.left);
	          process(root.left,root.val);
	          return root.val+sum;
	        
	      

	    }
	    public static int findSum(TreeNode root){
	        if(root==null)
	        return 0;
	        return root.val+findSum(root.left)+findSum(root.right);
	    }

}
