package BuildingFloor.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import BuildingFloor.dto.Building;
import BuildingFloor.dto.Floor;

public class BuildingCrud {
	
	public EntityManager getmanager() {
		
		return Persistence.createEntityManagerFactory("Gitashree").createEntityManager();
		
	}

	public void saveBuilding(Building build) {
		EntityManager em=getmanager();
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.persist(build);
		et.commit();
		
		

}
	public void updateBuilding(int id, String name, String address) {
		EntityManager em=getmanager();
		EntityTransaction et=em.getTransaction();
		Building build=em.find(Building.class, id);
		
		if(build!=null) {
			System.out.println(build.getName());
			build.setName(name);
			System.out.println(build.getName());
			build.setAddress(address);


			
			et.begin();
			em.merge(build);
			et.commit();
		}else
			System.out.println("Please provide valid building id");
		
		
	}

	public void deleteBuilding(int id) {
		EntityManager em=getmanager();
		EntityTransaction et=em.getTransaction();
		Building build=em.find(Building.class, id);
		if(build!=null) {
			et.begin();
			em.remove(build);
			et.commit();
		}else
			System.out.println("Property does not exit to delete " +id);
		
		
	}
	public void getBluidingById(int id) {
		EntityManager em=getmanager();
		
		Building build=em.find(Building.class, id);
		if(build!=null) {
			System.out.println(build);
		}else
		System.out.println("User does not found " +id);
	}

}