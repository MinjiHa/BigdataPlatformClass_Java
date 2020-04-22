package others;

import java.util.Arrays;

class Stud implements Comparable{
	int rollno;
	String name;
	int age;
	public Stud(int r, String n, int a) {
		this.rollno = r;
		this.name = n;
		this.age = a;
	}
	public int compareTo(Object o) {
		Stud s = (Stud)o;
		
		if (this.age == s.age)
			return 0;
		else if (this.age > s.age)
			return 1;
		else
			return -1;
	}
	@Override
	public String toString() {
		return name + " : " + age;
	}
	
	
	
}


public class OverrideCompareTo {

	public static void main(String[] args) {
		
		Stud[] stu = new Stud[3];
		stu[0] = new Stud(1,"홍길동",21);
		stu[1] = new Stud(2,"이순신",10);
		stu[2] = new Stud(3,"강감찬",40);
		Arrays.sort(stu);
		
		for(Stud s : stu) {
			System.out.println(s);
		}
		

	}

}
