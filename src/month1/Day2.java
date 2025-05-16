package month1;

public class Day2 {

	public static void main(String[] args) {
					//Task 1: Create a Person superclass and Student subclass
		System.out.println("************Task1***************");
		Student s1=new Student("ram",18,"12sdfgh23","A");
		s1.displayPersonInfo();
					//Task 2: Create an Employee class hierarchy
		System.out.println("************Task2***************");
		Manager m1=new Manager("ram",127000,"HR");
		m1.displayEmployeeDetails();
					//Task-3Constructor Practice overloading
		System.out.println("************Task3***************");
		Book b1=new Book();
		b1.displayBook();
		Book b2=new Book("Atomic Habits","James Clear",399.50);
		b2.displayBook();
		
		
		
	}

}

							//Task 1: Create a Person superclass and Student subclass
class Person{
	String name;
	int age;
	public Person(String name,int age){
		this.name=name;
		this.age=age;
		
	}
	void displayPersonInfo() {
		System.out.println("person name:"+this.name);
		System.out.println("person age:"+this.age);
	}
}

class Student extends Person{
	String studentId;
	String grade;
	public Student(String name,int age,String studentId,String grade){
		super(name,age);
		this.studentId=studentId;
		this.grade=grade;
	}
	@Override
	void displayPersonInfo() {
		super.displayPersonInfo();
		System.out.println("student studentId:"+this.studentId);
		System.out.println("student grade:"+this.grade);
	}
}


							//Task 2: Create an Employee class hierarchy
class Employee{
	String name;
	int salary;
	Employee(String name,int salary){
		this.name=name;
		this.salary=salary;
	}
	void displayEmployeeDetails() {
		System.out.println("Employee name:"+this.name);
		System.out.println("Employee salary:"+this.salary);
	}
}
class Manager extends Employee{
	String department;
	Manager(String name, int salary,String department) {
		super(name, salary);
		this.department=department;
	}
	void displayEmployeeDetails() {
		super.displayEmployeeDetails();
		System.out.println("Employee department:"+this.department);
	}
}

							//Task-3Constructor Practice overloading
class Book{
	String title="Unknown";
	String author="Anonymous";
	double price=0.0;
	void displayBook(){
		System.out.println("Title: " + this.title);
	    System.out.println("Author: " + this.author);
	    System.out.println("Price: " + this.price);
	}
	Book(){
		
	}
	Book(String title,String author,double price){
		this.title=title;
		this.author=author;
		this.price=price;
	}
	
}
