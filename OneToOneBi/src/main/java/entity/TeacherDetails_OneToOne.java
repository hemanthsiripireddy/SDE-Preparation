package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacherDetails_OneToOne")
public class TeacherDetails_OneToOne {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="city")
	private String city;
	@Column(name="hobby")
	private String hobby;
	@OneToOne(mappedBy="teacherDetails",cascade=CascadeType.ALL)
	private Teacher_OneToOne teacher;
	public TeacherDetails_OneToOne(String city, String hobby) {
		super();
		this.city = city;
		this.hobby = hobby;
	}
	@Override
	public String toString() {
		return "TeacherDetails_OneToOne [id=" + id + ", city=" + city + ", hobby=" + hobby 
				+ "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public Teacher_OneToOne getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher_OneToOne teacher) {
		this.teacher = teacher;
	}
	public TeacherDetails_OneToOne() {
		
	}
	

}
