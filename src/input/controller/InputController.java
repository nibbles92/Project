package input.controller;

import java.util.Scanner;

public class InputController
{	
	//Declaration section
	//All class data members declared private
	
	private Scanner myInput;
	
	//Constructors go here
	
	public InputController()
	{
		myInput = new Scanner(System.in);
	}
	
	//Methods
	
	public void start()
	{
		questions();
		questions();
	}
	
	private void questions()
	{
		System.out.println("hey, whats your name?");
		String input;
		input = myInput.next();
		myInput.nextLine();
		System.out.println("Your name is "+ input + ", that is neat!");
		System.out.println("Oops did I miss your full name? Please type it again");
		String fullName = myInput.nextLine();
		System.out.println("Your full name is: " + fullName);
		System.out.println("Your age please?");
		int  myAge = myInput.nextInt();
		System.out.println("Wow " + input + " you are " + myAge + " years old!!");
	}

}
