package ws2.java2.driver;

import ws2.java2.controller.*;
import ws2.java2.entity.Airplane;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
//		vm.displayVehicles(">> ��� ��� <<");
//		System.out.println(((Airplane)vm.vehicleArr[0]).getNumOfEngine());
		//Vehicle�� ���� �޼��带 �ҷ����� ���� ĳ����
		vm.sortByModelName();
		vm.displayVehicles(">> �𵨸����� ���ĵ� ��� ��� <<");
		vm.sortByMaxSpeed();
		vm.displayVehicles(">> �ӵ������� ���ĵ� ��� ��� <<");

		
	}
}