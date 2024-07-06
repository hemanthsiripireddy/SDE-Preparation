package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

class Solution {
    public int minimumDiameterAfterMerge(int[][] edges1, int[][] edges2) {

        Map<Integer,Set<Integer>> map1=new HashMap<>();
        Map<Integer, Set<Integer>>map2=new HashMap<>();

        for(int i=0;i<edges1.length;i++){
            int e1=edges1[i][0];
            int e2=edges1[i][1];
            map1.put(e1,map1.getOrDefault(e1,new HashSet<>()));
            map1.put(e2,map1.getOrDefault(e2,new HashSet<>()));
            map1.get(e1).add(e2);
            map1.get(e2).add(e1);

        }
        for(int i=0;i<edges2.length;i++){
            int e1=edges2[i][0];
            int e2=edges2[i][1];
            map2.put(e1,map2.getOrDefault(e1,new HashSet<>()));
            map2.put(e2,map2.getOrDefault(e2,new HashSet<>()));
            map2.get(e1).add(e2);
            map2.get(e2).add(e1);

        }
        int first=0,second=0;
        if(map1.size()>0)
            first=findMinPath(map1,map1.size());
        // res=Integer.MAX_VALUE;
        if(map2.size()>0)
            second=findMinPath(map2,map2.size());
        return first+second+1;

    }
    int res=Integer.MAX_VALUE;
    int[] arr;

    public int findMinPath(Map<Integer,Set<Integer>>map,int n){
        arr=new int[n];
        res=Integer.MAX_VALUE;
        int firstMax=-1;
        int secondMax=-1;
        int firstMaxChild=-1;
        int secondMaxChild=-1;
        int firstAns=0;
        for(int e: map.get(0)){
            int ans=localMethod(map,e,0,1);
            firstAns=Math.max(firstAns,ans);
            if(ans>=firstMax){
                secondMax=firstMax;
                secondMaxChild=firstMaxChild;
                firstMax=ans;
                firstMaxChild=e;
            }else if(ans>secondMax){
                secondMax=ans;
                secondMaxChild=e;
            }
        }
        res=Math.min(res,firstAns);
        for(int e:map.get(0)){

            if(firstMaxChild==e){
                secondMax=Math.max(0,secondMax);
                localMethod(map,e,0,secondMax+1);
            }else{
                localMethod(map,e,0,firstMax+1);

            }
        }

        return res;



    }
    public  int localMethod(Map<Integer,Set<Integer>>map,int cur,int prev,int dist) {



        int re=1;
        if(arr[cur]!=0){
            int ans=Math.max(arr[cur]-1,dist);
            res=Math.min(ans,res);
            for(int e:map.get(cur)){
                if(e!=prev){

                  localMethod(map,e,cur,dist+1);





                }
            }
            return -1;
        }
        arr[cur]=1;
        for(int e:map.get(cur)){
            if(e!=prev){

                int ans=localMethod(map,e,cur,dist+1);

                re=Math.max(ans+1,re);



            }
        }
        arr[cur]=re;
        return re;
    }


}