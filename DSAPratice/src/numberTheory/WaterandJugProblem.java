package numberTheory;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class WaterandJugProblem {
	static int i=0;
	 static class State{
	        int x;int y;
	        public State(int x,int y){
	            this.x=x;
	            this.y=y;
	        }
	    }
	 public static void method() {
		 int x=3,y=5,z=4;
		 boolean res=canMeasureWater(x, y, z);
		 System.out.println(res);
		 System.out.println(i);
	 }
	    public static boolean canMeasureWater(int jug1Capacity, int jug2Capacity, int targetCapacity) {
	        int x=jug1Capacity;
	        int y=jug2Capacity;
	        int z=targetCapacity;
	        if(x+y==z) return true;
	        if(x+y<z) return false;
	        Queue<State>queue=new LinkedList<>();
	        queue.add(new State(0,0));
	        Set<String>visited=new HashSet<>();

	        while(queue.size()>0){
	        	i++;
	            State curState=queue.poll();

	            int curX=curState.x;
	            int curY=curState.y;
	            if(curX+curY==z) {
	            	System.out.println(curX+" "+curY); 
	            	 return true;

	            	
	            }
	           
	            visited.add(curX+" "+curY);
	            int newX=0,newY=0;
	             newX=curX-Math.min(curX,y-curY);
	             newY=curY+Math.min(curX,y-curY);

	             if(!visited.contains(newX+" "+newY)){
	                 queue.add(new State(newX,newY));

	             }

	             newX=curX+Math.min(curY,x-curX);
	             newY=curY=Math.min(curY,x-curX);
	               if(!visited.contains(newX+" "+newY)){
	                 queue.add(new State(newX,newY));

	             }

	             newX=0;
	             newY=curY;
	               if(!visited.contains(newX+" "+newY)){
	                 queue.add(new State(newX,newY));

	             }
	             newY=0;
	             newX=curX;
	               if(!visited.contains(newX+" "+newY)){
	                 queue.add(new State(newX,newY));

	             }
	             newX=x;
	             newY=curY;
	               if(!visited.contains(newX+" "+newY)){
	                 queue.add(new State(newX,newY));

	             }
	             newY=y;
	             newX=curY;
	               if(!visited.contains(newX+" "+newY)){
	                 queue.add(new State(newX,newY));

	             }


	        }
	        return false;


	        
	        
	    }

}
