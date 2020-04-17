package myarraylist_;

import java.util.Arrays;

public class MyArrayList <T>{
	
	private static final int INIT_CAPACITY = 10;
	private T [] theData;
	private int n = 0;
	private int capacity = 0;
	
	public MyArrayList() {
		theData = (T []) new Object [INIT_CAPACITY];
		// theData = new T [INIT_CAPACITY];
		// 위의 코드는 그럴듯해보이지만 불가능하다.
		// new 명령어로 객체를 생성할 때 실존하지 않는 타입명이 타입자리에 들어가서는 안된다.
		// 따라서 오브젝트타입의 배열을 생성한 뒤에 T타입으로 변환해 주어야 한다.
	}
	
	public void add( int index , T anEntry ) {
		
		if(index<0||index>n) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		
		if(n >= capacity) {
			reallocate();
		}
		
		for(int i = n-1; i>=index; i--) 
			theData[i+1] = theData[i];
		theData[index] = anEntry;
		n++;
	}


	public void add( T anEntry ) {
		theData[n] = anEntry;
		n++;
	}
	
	private void reallocate() {
		
		capacity *= 2;
//		T[] tmp = (T[]) new Object [capacity];
//		for(int i = 0; i < n; i++) {
//			tmp[i] = theData[i];
//		}
//		theData = tmp;
		
		theData = Arrays.copyOf(theData,capacity);
	
	}
	
}
