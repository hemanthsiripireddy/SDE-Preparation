package entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SalesPerson {
	@Id
	private int id;
	private String name;
	public SalesPerson(int id, String name) {
		super();
		this.id = id;
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
	public SalesPerson() {
		super();
	}
	

}
