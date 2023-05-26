package BuildingFloor.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import BuildingFloor.dto.Building;
import BuildingFloor.dto.Floor;

public class FloorCrud {
public EntityManager getmanager() {
		
		return Persistence.createEntityManagerFactory("Gitashree").createEntityManager();
		
	}

public void saveFloor(Floor floors, int id) {
	EntityManager em=getmanager();
	
	
	
	Building build=em.find(Building.class, id);
	if(build!=null) {
		List<Floor>list=new ArrayList<Floor>();
		list.add(floors);
		list.addAll(build.getFloor());
		build.setFloor(list);
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(floors); //saving the floor
		em.merge(build);
		et.commit();
		
	}else
		System.out.println("Please provide the valid Floor no");
	
}

public void updateFloor(int id, Floor floors) {
	
	EntityManager em=getmanager();
	EntityTransaction et=em.getTransaction();
	
	Floor floor=em.find(Floor.class, id);
	if(floor!=null) {
//		System.out.println(floor.getId());
//		floor.setId(id);
//		System.out.println(floor.getId());
		floor.setName(floors.getName());
		floor.setAddress(floors.getAddress());
		
		
		
	//	floor.setFloor_no(floor.getFloor_no());
		
		et.begin();
		em.merge(floor);
		et.commit();
	}else
		System.out.println("Floor id does not exit. Please valid floor id");
	
}

public void deleteFloor(int id) {
	EntityManager em=getmanager();
	EntityTransaction et=em.getTransaction();
	Floor floor=em.find(Floor.class, id);
	if(floor!=null) {
		floor.setId(id);
		et.begin();
		em.remove(floor);
		et.commit();
	}else
		System.out.println("Floor id does not exit to delete.");
}

public void getFloorByID(int id) {
	
	EntityManager em=getmanager();
	
	Floor floor=em.find(Floor.class, id);
	if(floor!=null) {
		System.out.println(floor);
	}else
	System.out.println("Floor does not found " +id);
	
	}
}

