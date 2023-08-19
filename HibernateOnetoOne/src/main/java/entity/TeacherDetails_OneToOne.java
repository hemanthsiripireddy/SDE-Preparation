package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
	public TeacherDetails_OneToOne(String city, String hobby) {
		super();
		this.city = city;
		this.hobby = hobby;
	}
	

}
