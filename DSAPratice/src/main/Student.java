package main;

public class Student {
	public int id;
	public String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	//public boolean equals()
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	@Override
	public boolean equals(Object ob) {
		Student s=(Student)ob;
		return this.id==s.id;
	}
	

}
