package exceptionPractice;

class MyException extends Exception{
	public MyException() {
		super("���� ����ó���Դϴ�.");
	}
}

public class ExceptionPractice003 {

	public static void main(String[] args) throws MyException{
		
		int n = 3;
		
		if(n==3) {
			throw new MyException(); //���ܸ� �߻������ִ� ����
		}
		//���θ޼��忡�� throws�� ó����
		
		if(n==3) {
			try {
				throw new MyException();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		//try-catch�� ó����

	}

}
