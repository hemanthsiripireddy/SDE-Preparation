package week15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



public class SerializeandDeserializeBST {
	// Encodes a tree to a single string.
	public static void method() {
		int[] arr= {2,1};
		TreeNode root=formTree(arr);
		String ser=serialize(root);
		root=deserialize(ser);
		List<Integer>res=levelByLevelTraversal(root);
		for(int i:res) {
			System.out.print(i+" ");
		}
		
	}

	public static List<Integer> levelByLevelTraversal(TreeNode root) {
		List<Integer>list=new ArrayList<>();
		Queue<TreeNode>queue=new LinkedList<>();
		queue.add(root);
		while(queue.size()!=0) {
			TreeNode node=queue.poll();
			list.add(node.val);
			if(node.left!=null)
			queue.add(node.left);
			if(node.right!=null)
			queue.add(node.right);
		}
		return list;

	}
    public static String serialize(TreeNode root) {
        if(root==null)
        return "";
        StringBuilder sb=new StringBuilder();
        Queue<TreeNode>queue=new LinkedList<>();
        queue.add(root);
        while(queue.size()!=0){
            TreeNode cur=queue.poll();
            if(cur==null) {
            	sb.append("-1,");
            	continue;
            	
            }
            String temp=cur.val+",";
            
            sb.append(temp);
            if(cur.left==null&&cur.right==null)
            continue;
//            if(cur.left==null){
//                sb.append("-1,");
//            }else
            queue.add(cur.left);
//            if(cur.right==null){
//                sb.append("-1,");
//            }else{
                queue.add(cur.right);
            
        }
        return new String(sb);
        
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if(data.equals(""))
        return null;
        String[] arr=data.split(",");
        int[] intArr=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            intArr[i]=Integer.parseInt(arr[i]+"");
        }
        return formTree(intArr);
        
    }
    public static  TreeNode formTree(int[] arr) {
		Queue<TreeNode> queue = new LinkedList<>();
		int i = 0;
		TreeNode root = null;
		while (i < arr.length) {
			if (queue.size() == 0) {
				TreeNode node = new TreeNode(arr[i++]);
				queue.add(node);
				root = node;
			}
			else if (queue.size() != 0) {
				TreeNode node = queue.poll();
				if(arr[i]!=-1) {
					node.left = new TreeNode(arr[i++]);
					queue.add(node.left);
					
				}else {
					i++;
				}
				
				if (i < arr.length) {
					if(arr[i]!=-1) {
						node.right = new TreeNode(arr[i++]);
						queue.add(node.right);
						
					}else
						i++;
					

				}

			}
		}
		return root;

	}

}
