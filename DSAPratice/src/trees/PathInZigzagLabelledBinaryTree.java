package trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PathInZigzagLabelledBinaryTree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> res=pathInZigZagTree(8);
		for(int i=0;i<res.size();i++) {
			System.out.print(res.get(i)+" ");
		}
		//System.out.println(res.size());

	}
	static  class Node{
	        int val;
	        Node left;
	        Node right;
	        public Node(int val){
	            this.val=val;
	        }
	    }
	 static    List<Integer>res;
	    public static  List<Integer> pathInZigZagTree(int label) {
	        List<List<Integer>>list=new ArrayList<>();
	        int val=1;
	        int h=1;
	        res=new ArrayList<>();
	        while(val<=label){
	            int nv=(int)Math.pow(2,h-1);
	            int[] temp=new int[nv];
	            
	            for(int i=0;i<nv;i++){
	                if(h%2==1){
	                    temp[i]=val++;

	                }else{
	                    temp[nv-i-1]=val++;
	                }
	                if(val>label)
	                break;

	            }
	            List<Integer>tempList=new ArrayList<>();
	            for(int i=0;i<nv;i++){
	                if(temp[i]!=0)
	                tempList.add(temp[i]);
	            }
	            list.add(tempList);
	            h++;
	        }
	        Node root=form(list);
	        compute(root,label);
	        reverse(res);
	        return res;
	        
	    }
	    public static  Node form(List<List<Integer>>list){
	        int i=1;
	        Queue<Node>queue=new LinkedList<>();
	        Node root=new Node(1);
	        queue.add(root);
	        while(i<list.size()){

	            List<Integer>curArray=list.get(i++);
	            int j=0;
	            while(j<curArray.size()){
	                Node node=queue.poll();
	                node.left=new Node(curArray.get(j++));
	                queue.add(node.left);
	                if(j<curArray.size()){
	                    node.right=new Node(curArray.get(j++));
	                    queue.add(node.right);
	                }
	            }

	        }
	        return root;
	    }
	    public static  boolean compute(Node root,int label){
	        if(root!=null){
	            if(root.val==label){
	                res.add(label);
	                return true;
	            }else if(compute(root.left,label)){
	                res.add(root.val);
	                return true;
	            }else if(compute(root.right,label)){
	                res.add(root.val);
	                return true;
	            }
	            return false;
	        }
	        return false;
	    }
	    public static void reverse(List<Integer>list){
	        int i=0,j=list.size()-1;
	        while(i<j){
	            int temp=list.get(i);
	            list.set(i,list.get(j));
	            list.set(j,temp);
	            i++;
	            j--;
	        }
	    }

}
