package org.example;



public class Main {

    public static void main(String[] args) {
        System.out.println("hello");
        int[][] e1={{0,1},{2,0},{3,2},{3,5},{3,6},{3,9},{4,8},{5,4},{8,7}}

                ;
        int[][] e2={{0,1},{0,2},{0,3}}

                ;


        Solution solution=new Solution();
        int res=solution.minimumDiameterAfterMerge(e1,e2);
        System.out.println(res);





    }

}
