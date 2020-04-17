package ws2.java2.controller;

import java.util.Arrays;

import ws2.java2.entity.Airplane;
import ws2.java2.entity.Car;
import ws2.java2.entity.Ship;
import ws2.java2.entity.Vehicle;

public class VehicleManager {
	public Vehicle[] vehicleArr;
	int n = 0;
	
	public VehicleManager() {
		vehicleArr= new Vehicle[7];

		vehicleArr[0] = new Airplane("����747", 1300, 300, 4);
		vehicleArr[1] = new Airplane("F-16", 1600, 1, 1);
		
		vehicleArr[2] = new Car("�ҳ�Ÿ3", 180, 5, 10);
		vehicleArr[3] = new Car("Ƽ��", 130, 4, 15);
		vehicleArr[4] = new Car("��Ÿ����", 150, 10, 11);
		
		vehicleArr[5] = new Ship("ũ����2", 30, 400, 35000);
		vehicleArr[6] = new Ship("��ƿ����", 25, 150, 15000);
		
	}
	
	public void displayVehicles(String title) {
		System.out.println(title);
		
		for (int inx = 0 ; inx < vehicleArr.length ; inx++) {
			vehicleArr[inx].displayInfo();
			vehicleArr[inx].setAvailable(true);
		}
			
		System.out.println();
	}

	public void sortByModelName() {

		Vehicle tmp = new Vehicle();
		
		for(int j = 1; j <vehicleArr.length; j++ ) {
			
			for(int i = vehicleArr.length-1; i>0; i--) {
				
				if ((vehicleArr[i].getModelName()).compareTo(vehicleArr[i-1].getModelName()) < 0) {
					tmp = vehicleArr[i-1];
					vehicleArr[i-1] = vehicleArr[i];
					vehicleArr[i] = tmp;
				}
			}
		}
	}
	public void sortByMaxSpeed() {
		for(int i = 0; i < vehicleArr.length; i++) {
			Arrays.sort(vehicleArr);
		}
	}
	
}

