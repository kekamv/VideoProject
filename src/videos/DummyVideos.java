package videos;

import java.util.*;

import users.*;

public class DummyVideos {	
	
	public static void main(String args) {
		
		List <String> a = new ArrayList<String>();
			a.add("Java");
			a.add("Start");
			a.add("Spanish");
		List <String> b = new ArrayList<String>();
			b.add("Film");
			b.add("cartoons");
			b.add("2015");	
		List <String> c = new ArrayList<String>();
			c.add("Review");
			c.add("Video Editing");
		
		Video video1 = new Video (1, "https://www.youtube.com/watch?v=coK4jM5wvko", "Java Course. Presentation. Video 1",a);
		Video video2 = new Video(1, "https://www.youtube.com/watch?v=vMLFRAxY5cg", "¡Upsss! ¿Dondé está Noé? Estreno 22 de Mayo", b);
		Video video3 = new Video(2, "https://www.youtube.com/watch?v=XNxiXqIF7Uk", "Best Video Editing App For Android and iPhone", c);
	
		Video.videosList.add(video1);
		Video.videosList.add(video2);
		Video.videosList.add(video3);
		
		Video.videoByUserId.put(video1, 1);
		Video.videoByUserId.put(video2, 1);
		Video.videoByUserId.put(video3, 2);
	}
	
}
