package test;

interface IShape{
	void draw(int x, int y);
}

class Circle implements IShape{
	public void draw(int a,int b) {
		System.out.println("Draw a Circle : " + a + ", " + b );
	}
}

class Rectangle implements IShape{
	public void draw(int a,int b) {
		System.out.println("Draw a Rectangle : " + a + ", " + b );
	}
}

class DrawManager{
	IShape s;
	public DrawManager(IShape s) { //IShape s = new Circle();
		this.s = s;
	}
	public void draw(int s,int t) {
		this.s.draw(s,t);
	}
}

public class InterfacePractice {

	public static void main(String[] args) {
		
		DrawManager d = new DrawManager(new Circle()); //Circle 객체만 바꿔주면 된다.
		d.draw(1, 2);
		

		//인터페이스는 이렇게 규격화된 구조 덕분에 수정 및 객체 바꿔끼기가 용이하다.

	}

}
