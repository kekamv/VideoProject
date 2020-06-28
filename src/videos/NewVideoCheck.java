package videos;

public class NewVideoCheck {
	
	public String checkUrl(String url) {
		
		if (!url.startsWith("www.")) {// validation url starting with "www."
			
			throw new IllegalArgumentException("The url must start with \"www.\" , please try again");
		}
		return url;	
	}
	
	public String checkTitle(String title) { // validation at least 3 no empty characters
		
		if(title.toCharArray().length<3 || title.contains("   ")) {
			
			throw new IllegalArgumentException("The title should be significant and have at least 3 characters");
		}
		return title;
	}

}
