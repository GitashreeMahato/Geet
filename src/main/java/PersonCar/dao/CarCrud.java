package PersonCar.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


import PersonCar.dto.Car;
import PersonCar.dto.Person;

public class CarCrud {
	public EntityManager getmanager() {
		return Persistence.createEntityManagerFactory("Gitashree").createEntityManager();
	}

	public void saveCar(Car car, int id) {
		EntityManager em=getmanager();
		Person Per=em.find(Person.class, id);
		if(Per!=null) {
			List<Car>list= new ArrayList<Car>();
			list.add(car);
			list.addAll(Per.getCar());
			Per.setCar(list);
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.persist(car);
			em.merge(Per);
			et.commit();
			
		}else
			System.out.println("Please provide the valid carid");
	}
	public void updateCar(int id, Car car) {
		EntityManager em=getmanager();
		Car C=em.find(Car.class, id);
		if(C!=null) {
			C.setReg_no(car.getReg_no());
			C.setColor(car.getColor());
			EntityTransaction et=em.getTransaction();
			et.begin();
			em.merge(C);
			et.commit();
			
			
		}else
			System.out.println("Please provide the valid carid");
		
	}
	public void deleteCar(int id) {
		EntityManager em=getmanager();
		EntityTransaction et=em.getTransaction();
		Car C=em.find(Car.class, id);
		if(C!=null) {
			C.setId(id);
			et.begin();
			em.remove(C);
			et.commit();
		}else
			System.out.println("Car id does not exit to delete.");
	}

	public void getCarByID(int id) {
		
		EntityManager em=getmanager();
		Car C=em.find(Car.class, id);
		if(C!=null) {
			System.out.println(C);
		}else
		System.out.println("Car does not found " +id);
		
		}
}

