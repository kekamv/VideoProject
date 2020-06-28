package videos;

import java.util.*;

import users.*;

public class VideoArgEntries {
	
	public String enterUrl () { // arg url for video constructor
		
		String url="";
		Scanner scn=new Scanner(System.in);
		
		try {
			
			System.out.println("Please enter the url");
			System.out.println("The url must start with \"www.\"");
			
			url=new NewVideoCheck().checkUrl(scn.nextLine());
		}
		catch (IllegalArgumentException ex){
			
			System.out.println("Invalid url");
			enterUrl();
		}
		//scn.close();
		return url;
	}

	public String enterTitle() { // arg title for video constructor
		
		String title="";
		Scanner scn=new Scanner(System.in);
		
		try {
			
			System.out.println("Please enter the tile");
			System.out.println("The title should be significant and have at least 3 characters");
			
			title=new NewVideoCheck().checkTitle(scn.nextLine());
		}
		catch (IllegalArgumentException ex){
			
			System.out.println("Invalid title");
			enterTitle();
		}
		//scn.close();
		return title;	
	}
	
	public List<String> enterTags(){
		
		List<String> tags = new ArrayList<>();
		Scanner scn=new Scanner(System.in);
		
		try {
			System.out.println("Please enter your tags separated by commas");
			
			tags=Arrays.asList(scn.nextLine().split(","));
		}
		
		catch (NullPointerException ex) {
			
			System.out.print("Please enter at least one tag for your reference");
			enterTags();
		}
		//scn.close();
		return tags;
	}
	
	public int enterUserId(String NickN) { //arg userId provided according to the validated nickname
		
		int userId=0;
		
		try {
			userId=User.getUserByNick(NickN).getId();			
		}
		
		catch (NullPointerException ex){
			
			System.out.println("A valid user name is not available, the program will be terminated");
			System.exit(0);
		}
		return userId;
	}
}