package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
//student-coursedb
@Entity
@Table(name="course")
public class Course {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String name;
	@OneToMany(mappedBy = "course",cascade= {CascadeType.DETACH,CascadeType.MERGE,CascadeType.PERSIST,CascadeType.REFRESH})
	
	
	private List<Student>students;

	public Course(String name) {
		super();
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Student> getStuden() {
		return students;
	}

	public void setStuden(List<Student> studen) {
		this.students = studen;
	}

	@Override
	public String toString() {
		return "Course [id=" + id + ", name=" + name + ", studen=" + students + "]";
	}
	public void add(Student student) {
		if(students==null) {
			students=new ArrayList<Student>();
		}
		students.add(student);
	}
	public Course() {
		
	}
	
	
	

}
