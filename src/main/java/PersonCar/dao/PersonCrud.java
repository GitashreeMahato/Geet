package PersonCar.dao;


import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import PersonCar.dto.Person;

public class PersonCrud {
public EntityManager getmanager() {
		
		return Persistence.createEntityManagerFactory("Gitashree").createEntityManager();
		
	}
public void savePerson(Person Per) {
	EntityManager em=getmanager();
	EntityTransaction et=em.getTransaction();
	et.begin();
	em.persist(Per);
	et.commit();
	
	
}
public void updatePerson(int id, Person Per) {
	
	EntityManager em=getmanager();
	Person P=em.find(Person.class, id);
	if(P!=null) {
		P.setEmail(Per.getEmail());
		P.setPhone(Per.getPhone());
		P.setAddress(Per.getAddress());
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.merge(P);
		et.commit();
	
	}else
		System.out.println("User does not exit to update");
	
		
	}

public void deletePerson(int id) {
	EntityManager em=getmanager();
	Person Per=em.find(Person.class, id);
	
	if(Per!=null) {
		EntityTransaction et=em.getTransaction();
		et.begin();
		em.remove(Per);
		et.commit();
		
	}else
		System.out.println("User does not exit to delete");
}

public void getPersonById(int id) {
	EntityManager em=getmanager();
	Person Per=em.find(Person.class, id);
		if(Per!=null) {
			System.out.println(Per);
			
		}else
			System.out.println("User does not exit");
	}
	
}




