package BuildingFloor.controller;

import java.util.Scanner;

import BuildingFloor.dao.BuildingCrud;
import BuildingFloor.dao.FloorCrud;
import BuildingFloor.dto.Building;
import BuildingFloor.dto.Floor;

public class BuildingFloorMain {
	public static void main(String[] args) {
		
		
		
		BuildingCrud buildCrud=new BuildingCrud();
		FloorCrud fc=new FloorCrud();
		boolean check=true;
		
		
		do {
			System.out.println("choose options :   \n 1. Save Building \n 2. Save Floor   \n 3. Update Building \n 4. Update Floor \n 5. Delete Building \n 6. Delete Floor \n 7. Get Building by Id  \n 8. Get Floor by Id \n 9. Exit ");
			Scanner sc=new Scanner(System.in);
			int choice=sc.nextInt();
			switch(choice) {
			
			case 1: {
				System.out.println("Enter Building name:");
				String name=sc.next();
				
				System.out.println("Enter total_floor :");
				String total_floor=sc.next();
				
				System.out.println("Enter building address:");
				String address=sc.next();
				
				Building build=new Building(name, total_floor, address);
				buildCrud.saveBuilding(build);
			}break;
			
			case 2: {
				System.out.println("Enter Floor name:");
				String name=sc.next();
				
				System.out.println("Enter Floor_no :");
				String floor_no=sc.next();
				
				System.out.println("Enter  address:");
				String address=sc.next();
				
				
				Floor floor=new Floor(name, floor_no, address);
				fc.saveFloor(floor, 2);
			
			}break;
			
			case 3:{
				System.out.println("Enter building name:");
				String name=sc.next();
				
				System.out.println("Enter building address :");
				String address=sc.next();
				
			
				buildCrud.updateBuilding(1, name, address);
				
				
				
			}break;
			
			case 4 :{
				System.out.println("Enter floor name:");
				String name=sc.next();
				
				System.out.println("Enter floor address:");
				String address=sc.next();
				
				System.out.println("Enter the Floor id");
				int id=sc.nextInt();
				
			Floor floor=new Floor();
			floor.setName(name);
			floor.setAddress(address);
				
				
				fc.updateFloor(id, floor);
			}break;
			case 5:{
				System.out.println("Enter the building id");
				int id=sc.nextInt();
				buildCrud.deleteBuilding(id);
			}break;
			
			case 6:{
				System.out.println("Enter the floor id");
				int id=sc.nextInt();
				fc.deleteFloor(id);
			}
			
			case 7:{
				System.out.println("Enter building id:");
				int id=sc.nextInt();
				buildCrud.getBluidingById(id);
			}break;
			
			case 8:{
				System.out.println("Enter floor id:");
				int id=sc.nextInt();
				fc.getFloorByID(id);
			}
			
			default:break;
				
			}
			}
			while(check);
			
		
	}

}
