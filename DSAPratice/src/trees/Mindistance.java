package trees;

public class Mindistance {
	int findDist(Node root, int a, int b) {
        // Your code here
        int lesserOne=a,greatherOne=b;
        if(a>b){
            lesserOne=b;greatherOne=a;
        }
        Node node=lca(root,a,b);
        int h1=height(node.left,lesserOne);
        int h2=height(node.rigth,greatherOne);
        return h1+h2;
    }
    Node lca(Node root, int a,int b){
         while(true){
            if(a==root.data||b==root.data)
            return root;
            
            if((a<root.data&&b>root.data)||(b<root.data&&a>root.data))
            return root;
            else if(a<root.data&&b<root.data)
            root=root.left;
            else
            root=root.rigth;
        }
    }
    int height(Node root,int val){
        if(root.data==val)
        return 0;
        if(val<root.data)
        return 1+height(root.left,val);
        else
         return 1+height(root.rigth,val);
        
        
    }

}
