package videos;

import java.util.*;

import users.User;
public class Video {
	
	public static HashMap<Video, Integer> videoByUserId = new HashMap<>();
	
	public static List <Video> videosList = new ArrayList <>();
	
	public static Video addVideo(String Nick) {
		
		int userId=new VideoArgEntries().enterUserId(Nick);
		String url = new VideoArgEntries().enterUrl();
		String title = new VideoArgEntries().enterTitle();
		List<String> tags= new VideoArgEntries().enterTags();
		
		Video videoString = new Video(userId, url, title, tags);
		
		videoByUserId.put(videoString, userId);
		videosList.add(videoString);
		
		return videoString;
	}

	
	/*private static Integer Integer(int userId) {
		return Integer(userId);
	}
	*/

	public void getVideoDetails () {
		
		System.out.println("Title: "+ "\t"+this.title+"\n"+"Url: "+"\t"+ this.url+"\n");
	}

	public Video (int userId, String url, String title, List<String> tags) {
		
		id=1+ Id;
		this.userId = userId;
		this.url = url;
		this.title = title;		
		this.tags = tags;
		
		Id++;
		IdNV++;
	}
	
	private static int Id=0;
	private static int IdNV=0;
	public static String videoString= "video"+ Video.IdNV;
	
	private int id;
	private int userId;
	private String url;
	private String title;
	private List<String> tags; 

}
