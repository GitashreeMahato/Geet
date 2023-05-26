package PersonCar.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import PersonCar.dao.CarCrud;
import PersonCar.dao.PersonCrud;
import PersonCar.dto.Car;
import PersonCar.dto.Person;

public class PersonCarMain {
	
public static void main(String[] args) {
	 PersonCrud percrud=new PersonCrud();
	 CarCrud CCrud=new CarCrud();
	 boolean check=true;
	 
	 do{
		 System.out.println("choose options :   \n 1. Save Person \n 2. Save Car   \n 3. Update Person \n 4. Update Car \n 5. Delete Person \n 6. Delete car\n 7. Get Person by Id  \n 8. Get Car by Id \n 9. Exit ");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1: {
				
				System.out.println("Enter model:");
				String model=sc.next();
				
				System.out.println("Enter manufacturer");
				String manufacturer=sc.next();
				
				System.out.println("Enter reg_no:");
				String reg_no=sc.next();
				
				System.out.println("Enter bodytype:");
				String bodytype=sc.next();
				
				System.out.println("Enter color:");
				String color=sc.next();
				
				System.out.println("Enter pname:");
				String name=sc.next();
				
				System.out.println("Enter Pemailid:");
				String email=sc.next();
				
				System.out.println("Enter Phonemo:");
				long phone=sc.nextLong();
				
				System.out.println("Enter Paddress:");
				String address=sc.next();
				
				Car car1=new Car(model, manufacturer, reg_no, bodytype, color);
				List<Car>list=new ArrayList<Car>();
				list.add(car1);
				
				Person per=new Person(name, email, phone, address, list);
				percrud.savePerson(per);
				
			}break;
			
			case 2:{
				
				System.out.println("Enter model:");
				String model=sc.next();
				
				System.out.println("Enter manufacturer");
				String manufacturer=sc.next();
				
				System.out.println("Enter reg_no:");
				String reg_no=sc.next();
				
				System.out.println("Enter bodytype:");
				String bodytype=sc.next();
				
				System.out.println("Enter color:");
				String color=sc.next();
				
				System.out.println("Enter Person id");
				int id=sc.nextInt();
				
				Car car=new Car(model, manufacturer, reg_no, bodytype, color);
				CCrud.saveCar(car, id);
			}break;
			
			case 3:{
				System.out.println("Enter Person email:");
				String name=sc.next();
				
				System.out.println("Enter phoneno");
				long phone=sc.nextLong();
				
				System.out.println("Enter Person address :");
				String address=sc.next();
				
				System.out.println("Enter person id");
				int id=sc.nextInt();
				
				Person per=new Person();
				per.setName(name);
				per.setPhone(phone);
				per.setAddress(address);
				
				percrud.updatePerson(id, per);
				
			}break;
			
			case 4:{
				System.out.println("Enter reg_no:");
				String reg_no=sc.next();
				
				System.out.println("Enter color");
				String color=sc.next();
				
				System.out.println("Enter person id");
				int id=sc.nextInt();
				
				 Car car= new Car();
				 car.setReg_no(reg_no);
				 car.setColor(color);
				 
				 CCrud.updateCar(id, car);
				
			}break;
			
			case 5:{
				System.out.println("Enter the person id");
				int id=sc.nextInt();
				percrud.deletePerson(id);
			}break;
			
			case 6:{
				System.out.println("Enter the Car id");
				int id=sc.nextInt();
				CCrud.deleteCar(id);
			}
			
			case 7:{
				System.out.println("Enter the person id:");
				int id=sc.nextInt();
				percrud.getPersonById(id);
			}break;
			
			case 8:{
				System.out.println("Enter the Car id:");
				int id=sc.nextInt();
				CCrud.getCarByID(id);
			}
			
			default:break;
				
			}
			}
			while(check);
				
			}

	 
}

