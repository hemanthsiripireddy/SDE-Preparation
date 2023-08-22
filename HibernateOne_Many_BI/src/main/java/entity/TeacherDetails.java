package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="teacherDetails")
public class TeacherDetails {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="city")
	private String city;
	@Column(name="hobby")
	private String hobby;
	public TeacherDetails(String city, String hobby) {
		super();
		this.city = city;
		this.hobby = hobby;
	}
	public TeacherDetails() {
		
	}
	@Override
	public String toString() {
		return "TeacherDetails [id=" + id + ", city=" + city + ", hobby=" + hobby + "]";
	}
	
	
	

}
