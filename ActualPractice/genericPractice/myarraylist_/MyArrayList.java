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
		// ���� �ڵ�� �׷����غ������� �Ұ����ϴ�.
		// new ��ɾ�� ��ü�� ������ �� �������� �ʴ� Ÿ�Ը��� Ÿ���ڸ��� ������ �ȵȴ�.
		// ���� ������ƮŸ���� �迭�� ������ �ڿ� TŸ������ ��ȯ�� �־�� �Ѵ�.
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
