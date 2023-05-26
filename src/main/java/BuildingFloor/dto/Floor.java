package BuildingFloor.dto;
import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Cacheable

public class Floor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String name;
private String floor_no;
private String address;
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
public String getFloor_no() {
	return floor_no;
}
public void setFloor_no(String floor_no) {
	this.floor_no = floor_no;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
@Override
public String toString() {
	return "Floor [id=" + id + ", name=" + name + ", floor_no=" + floor_no + ", address=" + address + "]";
}
public Floor(String name, String floor_no, String address) {
	super();
	this.name = name;
	this.floor_no = floor_no;
	this.address = address;
}
public Floor() {
	super();
}



}
