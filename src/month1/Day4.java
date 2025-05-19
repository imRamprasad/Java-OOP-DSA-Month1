package month1;
							//Day 4 Plan: Java – Inheritance & Polymorphism Deep Dive

public class Day4 {
			public static void main(String args[]) {
					//Task 1: Method Overloading
				System.out.println("************Task1***************");
				Calculator c1=new Calculator();
				System.out.println("Addition is: "+c1.add(1,2));
					//Task 2: Method Overriding and Polymorphism
				System.out.println("************Task2***************");
				shape C1=new Circle();
				C1.area();
				shape R1=new Rectangle();
				R1.area();
				shape T1=new Triangle();
				T1.area();
					//Task 3: Abstract Class Practice
				System.out.println("************Task3************");
				Animal D1=new Dog();
				D1.makeSound();
				Animal c2=new Cat();
				c2.makeSound();
					//Task 4: Interface Practice
				System.out.println("************Task4************");
				Vehical C3=new Car();
				Vehical B1=new Bike();
				C3.start();
				C3.stop();
				B1.start();
				B1.stop();
				  // mix abstract classes and interfaces in a mini project
				System.out.println("************Bonus************");
				SmartPhone phone = new SmartPhone("Samsung", "Galaxy S25");
		        phone.displayDetails();
		        phone.turnOn();
		        phone.connectToInternet();
		        phone.installApp("WhatsApp");
		        phone.voiceAssistant();
		        phone.makeCall();
		        phone.turnOff();

		        System.out.println();

		        SmartWatch watch = new SmartWatch("Apple", "Watch Series 8");
		        watch.displayDetails();
		        watch.turnOn();
		        watch.connectToInternet();
		        watch.installApp("FitBit");
		        watch.voiceAssistant();
		        watch.trackSteps();
		        watch.turnOff();
				
				
				
			}
}

									//Task 1: Method Overloading

class Calculator{
	int add(int a, int b) {
		return a+b;
	}
	double add(double a, double b) {
		return  a+b;
	}
	int add(int a, int b, int c) {
		return a+b+c;
	}

}

								//Task 2: Method Overriding and Polymorphism
class  shape{
	void area() {
		System.out.println("Area of Shape");
	}
}
class Circle extends  shape{
	@Override
	public void area(){
		System.out.println("circle is π*r^2");
	}
	
}
class Rectangle extends  shape{
	@Override
	public void area(){
		System.out.println("Reactangle is length*breath");
	}
	
}
class Triangle extends  shape{
	@Override
	public void area(){
		System.out.println("Triangle is 0.5*base*hight");
	}	
}


						//Task 3: Abstract Class Practice
abstract class Animal {
	abstract void makeSound();
}

class Dog extends Animal{
	@Override
	void makeSound() {
		System.out.println("Dog make sound");
	}
}
class Cat extends Animal{
	@Override
	void makeSound() {
		System.out.println("Cat make sound");
	}
}


						//Task 4: Interface Practice
interface Vehical{
	public void start();
	public  void stop();
}

class Car implements Vehical{
	public void start() {
		System.out.println("Car started");
		}
	public void stop() {
		System.out.println("Car Stoped");
	}
}
class Bike implements Vehical{
	public void start() {
		System.out.println("Bike started");
	}
	public void stop() {
		System.out.println("Bike stoped");
	}
}


						//Bonus Tip:- mix abstract classes and interfaces in a mini project
abstract class Device implements Smart{
	String brand;
	String model;
	Device (String brand,String model){
		this.brand=brand;
		this.model=model;
	}
	abstract void turnOn();
	abstract void turnOff();
	void displayDetails() {
		
	}
	
}

interface Smart{
	void connectToInternet();
	void installApp(String appName);
	void voiceAssistant();
}

class SmartPhone extends Device{
		SmartPhone(String brand,String model){
			super(brand,model);
		}
		@Override
		public void connectToInternet() {
			System.out.println("Internet connected");
			
		}
		@Override
		public void installApp(String appName) {
			System.out.println(appName+" is installed");
			
		}
		@Override
		public void voiceAssistant() {
			System.out.println("Hi hello how can i help you");
			
		}
		@Override
		void turnOn() {
			System.out.println("on Successfully");
			
		}
		@Override
		void turnOff() {
			System.out.println("Off Successfully");
			
		}
		void  makeCall() {
			System.out.println("Call  Successfully");
		}
		
	}
class SmartWatch extends Device{
	SmartWatch(String brand,String model){
		super(brand,model);
	}
	@Override
	public void connectToInternet() {
		System.out.println("Internet connected");
		
	}
	@Override
	public void installApp(String appName) {
		System.out.println(appName+" is installed");
		
	}
	@Override
	public void voiceAssistant() {
		System.out.println("Hi hello how can i help you");
		
	}
	@Override
	void turnOn() {
		System.out.println("on Successfully");
		
	}
	@Override
	void turnOff() {
		System.out.println("Off Successfully");
		
	}
	void  trackSteps() {
		System.out.println("Tracking  Successfully");
	}
	
}
		
	
