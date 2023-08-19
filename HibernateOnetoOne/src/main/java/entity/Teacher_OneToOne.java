package entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teacher_OneToOne")
public class Teacher_OneToOne {
	@Id
	@Column(name="id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name="f_name")
	private String f_name;
	@Column(name="l_name")
	private String l_name;
	@Column(name="email")
	private String email;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="teacher_details_id")
	private TeacherDetails_OneToOne teacherDetails;
	
	public Teacher_OneToOne(String f_name, String l_name, String email) {
		this.f_name = f_name;
		this.l_name = l_name;
		this.email = email;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public TeacherDetails_OneToOne getTeacherDetails() {
		return teacherDetails;
	}

	public void setTeacherDetails(TeacherDetails_OneToOne teacherDetails) {
		this.teacherDetails = teacherDetails;
	}
	
	

}
