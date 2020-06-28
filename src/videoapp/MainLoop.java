package videoapp;

import java.util.Scanner;

import users.User;

public class MainLoop {
	
	public static void Start (){
		
		switch (AppMethods.logInU) {

		case 1:

			AppMethods.userWelc();

			AppMethods.confirmPassw();
			
			System.out.println("Welcome "+ AppMethods.nickNW);
			
			MainMenu.mainMenu();
			
			break;
			
		case 2:
			
			User.addUser();
			
			AppMethods.logIn();
			
			Start();
			
			break;
			
		default: 
			
			System.out.println("An error occurred. Please try again");
			System.exit(0);
		}
		
	}
	
	

}
