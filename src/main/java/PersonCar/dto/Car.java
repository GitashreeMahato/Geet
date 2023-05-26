package PersonCar.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Car {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String model;
	private String manufacturer;
	private String reg_no;
	private String bodytype;
	private String color;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getReg_no() {
		return reg_no;
	}
	public void setReg_no(String reg_no) {
		this.reg_no = reg_no;
	}
	public String getBodytype() {
		return bodytype;
	}
	public void setBodytype(String bodytype) {
		this.bodytype = bodytype;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", manufacturer=" + manufacturer + ", reg_no=" + reg_no
				+ ", bodytype=" + bodytype + ", color=" + color + "]";
	}
	public Car(String model, String manufacturer, String reg_no, String bodytype, String color) {
		super();
		this.model = model;
		this.manufacturer = manufacturer;
		this.reg_no = reg_no;
		this.bodytype = bodytype;
		this.color = color;
	}
	public Car() {
		super();
	}
	
	
	

}
