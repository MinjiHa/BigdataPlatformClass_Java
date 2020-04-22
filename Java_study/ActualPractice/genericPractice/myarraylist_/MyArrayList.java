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
		//		theData[n] = anEntry;
		//		n++;
		add(n,anEntry);
	}
	
	public int size() { //���� MyArrayList�� ����Ǿ� �ִ� �������� ������ �������ִ� �޼���
		return n;
	}
	
	public int indexOf( T anEntry ) {
		for( int i = 0; i < n; i++) {
			if (theData[i].equals(anEntry)) {
				return i;
			}
		}
		return -1;
	}
	
	public T get(int index) {
		
		if(index<0||index>=n) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		return theData[index];
	}
	
	public T set(int index, T newValue) {
		
		if(index<0||index>=n) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		T oldValue = theData[index];
		theData[index] = newValue;
		return oldValue;
	}
	
	//Mark! Study perfectly
	public T remove(int index) {
		if(index<0||index>=n) {
			throw new ArrayIndexOutOfBoundsException(index);
		}
		T returnValue = theData[index];
		for(int i = index + 1; i < n; i-- )
			theData[i-1] = theData[i];
		n--;
		return returnValue;
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
