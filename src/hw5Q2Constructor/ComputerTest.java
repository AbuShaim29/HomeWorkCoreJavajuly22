package hw5Q2Constructor;
//Create a package name "hw5Q2Constructor" in your Home Work project. Inside the package, a) Create a class "Computer". Declare some variable -- brand, model, operating system, price, grade (grade as char) and madeInUSA. Declare default constructor and more than one parameterized constructor. Use only one System.out.println() in each constructor. b) Create another class ComputerTest. Create object from Computer class, as many as you want under main method. Initialize all the constructors. I want in console, the first outcome as -> This is from default Constructor of Computer class. Second outcome as-> My Brand: Apple, Model: MacBook Air, Operating system: MacOS Mojave, Price: $800, Grade: A and Made in USA? Ans: false. I want the third outcome in console for your configuration.  (Assume you are a Windows user even you are not). Organize your code. Push in the github. Paste your github link below
public class ComputerTest {


public static void main(String[] args) {
  Computer computer = new Computer();
  Computer computer2 = new Computer("Apple","Macbook Air","MacOS",800, false, 'A');
  Computer computer3 = new Computer("samsung", "Ryzen", "Windows", 1000, false,'A' );

	

	
	
	
	
	
	
	
   }

}
