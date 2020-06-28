package videoapp;

import java.time.LocalDate;
import java.util.*;
import users.*;
import videos.DummyVideos;
import videos.Video;

public class VideoApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
DummyUsers.main(null);
DummyVideos.main(null);		
		//	System.exit(0);
		
System.out.println("Welcome to Video Fun Storage!");

AppMethods.logIn();

MainLoop.Start();		
	

	}

}
