package ws2.java2.driver;

import ws2.java2.controller.*;
import ws2.java2.entity.Airplane;

public class VehicleDriver {
	public static void main(String[] args) {
		VehicleManager vm = new VehicleManager();
//		vm.displayVehicles(">> 재고 목록 <<");
//		System.out.println(((Airplane)vm.vehicleArr[0]).getNumOfEngine());
		//Vehicle에 없는 메서드를 불러오기 위한 캐스팅
		vm.sortByModelName();
		vm.displayVehicles(">> 모델명으로 정렬된 재고 목록 <<");
		vm.sortByMaxSpeed();
		vm.displayVehicles(">> 속도순으로 정렬된 재고 목록 <<");

		
	}
}