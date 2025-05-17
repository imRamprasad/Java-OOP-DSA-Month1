package month1;
									// Day 1: Java OOP Fundamentals — Classes & Objects
public class Day1ClassesObjects {

	public static void main(String[] args) {
		                                    //Task1 Create a Student Class
		System.out.println("************Task1***************");
		Task1 T1=new Task1("ram1",11,"A");
		Task1 T2=new Task1("ram2",12,"B");
		Task1 T3=new Task1("ram3",13,"F");
		T1.displayStudentInfo();
		T2.displayStudentInfo();
		T3.displayStudentInfo();
		System.out.println(T1.isPassed());
		System.out.println(T3.isPassed());
		
		                                  //Task2 Create a Rectangle Class
		System.out.println("************Task2***************");
		Task2 T4=new Task2(10,20);
		Task2 T5=new Task2(30,50);
		T4.display();
		T5.display();
		
										//Task3 Create a BankAccount Class
		System.out.println("************Task3***************");
		Task3 t6=new Task3("125Q2A45678A","RamPrasad");
		t6.setBalance(10000);
		t6.displayAccountInfo();
		t6.deposit(3000);
		t6.displayAccountInfo();
		t6.withdraw(3000);
		t6.displayAccountInfo();
	}

}
							//Task1 Create a Student Class
class Task1{
	String name;
	int rollNumber;
	String grade;
	public Task1(String name,int rollNumber,String grade){
		this.name=name;
		this.rollNumber=rollNumber;
		this.grade=grade;
		
	}
	void displayStudentInfo() {
		System.out.println("name:"+this.name);
		System.out.println("rollNum:"+this.rollNumber);
		System.out.println("grade "+this.grade);
		
	}
	boolean isPassed() {
		if(this.grade.equals("A")||this.grade.equals("B") || this.grade.equals("C")) {
			return true;
		}
		else {
			return false;
		}
		
	}
}
								//Task2 Create a Rectangle Class
class Task2{
	double length;
	double width;
	Task2(double length,double width){
		this.length=length;
		this.width=width;	
	}
	double calculateArea(){
		return this.length*this.width;
	}
	double calculatePerimeter() {
		return 2*(this.length+this.width);
	}
	void display() {
		System.out.println("length:"+this.length);
		System.out.println("Width:"+this.width);
		System.out.println("calculateArea:"+calculateArea());
		System.out.println("calculateArea:"+calculatePerimeter());
	}
}
									//Task3 Create a BankAccount Class
class Task3{
	String accountNumber;
	String accountHolder;
	private double balance;
	Task3(String accountNumber,	String accountHolder){
		this.accountNumber=accountNumber;
		this.accountHolder=accountHolder;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	void withdraw(double amount) {
		this.balance=this.balance-amount;
	}
	void displayAccountInfo() {
		System.out.println("accountNumber:"+this.accountNumber);
		System.out.println("accountHolder:"+this.accountHolder);
		System.out.println("balance:"+this.balance);
	}
}