package dataSwitchStudy;

class Data{
	void open() { System.out.println("open"); }
}
class Excel extends Data{
	void open() { System.out.println("Excel open"); }
}
class Word extends Data{
	void open() { System.out.println("Word open"); }
}

public class DataSwitch {

	public static void main(String[] args) {

		Data e = new Word(); 	//Data를 동시에 상속하는 Word는 Excel로 바꿔끼면 프로그램을 바꿔낄 수 있다. 수정이 용이하다.
								//Word의 open과 Excel의 open은 다르게 구현되어 있을것이다.
								//하지만 각각 오버라이딩했기 때문에 바꿔끼웠을 때 정상적으로 작동한다.
		e.open();
	}

}
