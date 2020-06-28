package videoapp;

import java.util.*;

import users.User;

public class AppMethods {
	
	public static int logInU =0;
	
	public static String nickNW;
	
	public static String passWord="";
	
	public static int logIn() { // check a valid option to enter an existing user or create a new one
		
		Scanner slogIn = new Scanner(System.in);
		
		System.out.println("To log in enter 1 to create a new account enter 2");
		
		logInU = slogIn.nextInt();
		slogIn.nextLine();
		
		if (logInU!=1 && logInU!=2) {
			
			logIn();	
		}
		
		return logInU;
	}

	public static String userWelc() {
		
		Scanner uWel = new Scanner(System.in);
		System.out.println("Please enter your user name");
		
		nickNW = uWel.nextLine();	
		
		if(!User.usersPool.containsKey(nickNW)) {
			
			userWelc();
		}

		return nickNW;
		}
	
	public static void confirmPassw() {
		
		Scanner uPass = new Scanner(System.in);
		
		System.out.println("Please enter your password");
		
		passWord = uPass.nextLine();
		
		if(!User.usersPool.get(nickNW).equals(passWord)){
			
			confirmPassw();
		}
		
	}
}
