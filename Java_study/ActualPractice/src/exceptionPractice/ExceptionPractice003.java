package exceptionPractice;

class MyException extends Exception{
	public MyException() {
		super("나의 예외처리입니다.");
	}
}

public class ExceptionPractice003 {

	public static void main(String[] args) throws MyException{
		
		int n = 3;
		
		if(n==3) {
			throw new MyException(); //예외를 발생시켜주는 구문
		}
		//메인메서드에서 throws로 처리함
		
		if(n==3) {
			try {
				throw new MyException();
			} catch (MyException e) {
				// TODO Auto-generated catch block
				System.out.println(e.getMessage());
			}
		}
		//try-catch로 처리함

	}

}
