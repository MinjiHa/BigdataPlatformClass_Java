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

		Data e = new Word(); 	//Data�� ���ÿ� ����ϴ� Word�� Excel�� �ٲ㳢�� ���α׷��� �ٲ㳥 �� �ִ�. ������ �����ϴ�.
								//Word�� open�� Excel�� open�� �ٸ��� �����Ǿ� �������̴�.
								//������ ���� �������̵��߱� ������ �ٲ㳢���� �� ���������� �۵��Ѵ�.
		e.open();
	}

}
