package videoapp;

import java.util.*;

import users.User;
import videos.AccessVideos;
import videos.Video;

public class MainMenu {
	
	static String entryUser="";
	
	public static void mainMenu() {
		
		Scanner scn= new Scanner(System.in);
		
		System.out.println("Please enter: "+"\n"+"1 To save a new video"+ "\n"+ "2 To list your videos"+
				"\n"+"3 To see your profile"+"\n"+ "or 0 to log out");
		
		entryUser=scn.nextLine();
		
		switch (entryUser) {
		
		case "1":
			
			Video.addVideo(AppMethods.nickNW);
			mainMenu();
			break;
		
		case "2":
			
			AccessVideos.getVideosForUser();
			mainMenu();
			break;
		
		case "3":
			
			User user= User.getUserByNick(AppMethods.nickNW);
			user.getUser();	
			mainMenu();
			break;	
			
		case "0":
			scn.close();
			System.exit(0);
		
		default:
			
			scn.close();
			System.out.print("Unexpected error");
			System.exit(0);
			
		}
	}

}
