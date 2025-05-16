package month1;

public class Day3 {
	public static void main(String args[]) {
							//Task 1: Create an EncapsulatedStudent Class
		System.out.println("************Task1***************");
		EncapsulatedStudent s1=new EncapsulatedStudent();
		s1.setName("Ramprasad");
		s1.setAge(18);
		s1.setGrade('A');
		System.out.println("name is :"+s1.getName());
		System.out.println("Age is :"+s1.getAge());
		System.out.println("Grade is :"+s1.getGrade());
							//Task 2: Create a Counter Class
		System.out.println("************Task2***************");
		Counter c1=new Counter();
		System.out.println("Count:"+c1.getCount());
		Counter c2=new Counter();
		System.out.println("Count:"+c2.getCount());
		Counter c3=new Counter();
		System.out.println("Count:"+c3.getCount());
		
							//Task 3: Final Keyword Practice
		System.out.println("************Task3***************");
		try {
			MathConstants m1=new MathConstants();
//			m1.PI=3.14;
		}
		catch(Exception e) {
			e.getMessage();
		}
		System.out.println("Final key word is constant we cannot modify");
		
	}
}
							//Task 1: Create an EncapsulatedStudent Class
class EncapsulatedStudent{
	private String name;
	private int age;
	private char grade;
	void setName(String name) {
		this.name=name;
	}
	void setAge(int age) {
		this.age=age;
	}
	void setGrade(char grade) {
		this.grade=grade;
	}
	String getName() {
		return this.name;
	}
	int getAge() {
		return this.age;
	}
	char getGrade() {
		return this.grade;
	}
}
							//Task 2: Create a Counter Class
class Counter{
	static int count;
	Counter(){
		count=count+1;
	}
	int getCount() {
		return count;
	}
}

							//Task 3: Final Keyword Practice

class MathConstants{
	final double PI = 3.14159;
	
	
}