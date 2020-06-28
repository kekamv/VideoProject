package users;

import java.util.Scanner;

public class UserArgEntries {
	
	public String enterName () { //arg name for user constructor
		
		Scanner scn=new Scanner(System.in);
		
		System.out.println("Please enter your first name and middle name");
		
		String name=scn.nextLine();
		
		//scn.close();
		
		return name;
	}
	

	public String enterSurname () { //arg surname for user class constructor
		
		Scanner scn1=new Scanner(System.in);
		
		System.out.println("Please enter your family name");
		
		String surname=scn1.nextLine();
		
		//scn1.close();
		
		return surname;
	}

	
	public String enterPassword () { //arg password for user constructor
		
		String password="";
		Scanner scn=new Scanner(System.in);
		
		try {
			
			System.out.println("Please enter your password");
			System.out.println("The password must include one special character and at least "
			+"one number and four letters");
			
			password=new NewUserCheck().checkPassword(scn.nextLine());
		}
		catch (IllegalArgumentException ex){
			
			System.out.println("Invalid password");
			enterPassword();
		}
		//scn.close();
		return password;
	}
	
	public String enterNickname () {
		
		String nickname = "";
		Scanner scn=new Scanner(System.in);
		
		try {
			
			System.out.println("Please enter your user name, it should contain at least two characters and no empty spaces");
			
			nickname=new NewUserCheck().checkNickname(scn.nextLine());
		
		}catch (IllegalArgumentException ex) {
			
			System.out.println("This user name is not available");
			enterNickname();
		}
		
		//scn.close();
		return nickname;
	}
	
	
}


