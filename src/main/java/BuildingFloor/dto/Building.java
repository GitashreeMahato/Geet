package BuildingFloor.dto;

import java.util.List;

import javax.persistence.Cacheable;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
@Cacheable

public class Building {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String total_floor;
	private String address;
	
	@OneToMany(cascade = CascadeType.ALL)
	List<Floor> floor;

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

	public String gettotal_floor() {
		return total_floor;
	}

	public void settotal_floor(String total_floor) {
		this.total_floor = total_floor;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Floor> getFloor() {
		return floor;
	}

	public void setFloor(List<Floor> floor) {
		this.floor = floor;
	}

	

	@Override
	public String toString() {
		return "Building [id=" + id + ", name=" + name + ", total_floor=" + total_floor + ", address=" + address
				+ ", floor=" + floor + "]";
	}

	

	public Building(String name, String total_floor, String address) {
		super();
		this.name = name;
		this.total_floor = total_floor;
		this.address = address;
	}

	public Building() {
		super();
	}
	
	
	
	
	
	

}
