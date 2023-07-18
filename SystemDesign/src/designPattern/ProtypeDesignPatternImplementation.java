package designPattern;

import java.util.ArrayList;
import java.util.List;

public class ProtypeDesignPatternImplementation {
	public static void main(String[] args) {
		Movies movies=new Movies();
		movies.loadMovies();
		List<String>originalList=movies.getList();
		
		Movies prototype=(Movies) movies.clone();
		List<String>prototypeList=prototype.getList();
		prototypeList.add("geetha govindam");
		System.out.println(originalList);
		System.out.println(prototypeList);
		
	}

}
 class Movies implements Cloneable{
	 private List<String>list;
	 public Movies() {
		 this.list=new ArrayList<>();
	 }
	 public Movies(List<String>list) {
		 this.list=list;
	 }
	 public void loadMovies() {
		 list.add("bharathAneNenu");
		 list.add("baby");
		 list.add("dhoni");
	 }
	 
	 public List<String> getList() {
		return list;
	}
	public void setList(List<String> list) {
		this.list = list;
	}
	public Object clone() {
		 List<String> duplicate=new ArrayList<>();
		 for(String movie:list) {
			 duplicate.add(movie);
		 }
		 return new Movies(duplicate);
	 }
	
}
