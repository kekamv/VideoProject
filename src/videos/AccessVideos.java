package videos;

import users.User;
import videoapp.AppMethods;

public class AccessVideos {
	
	public static void getVideosForUser() {
		
		User user= User.getUserByNick(AppMethods.nickNW);
		
		for(Video k:Video.videoByUserId.keySet()) {
			
			if(Video.videoByUserId.get(k).intValue()==user.getId()) {
			
				k.getVideoDetails();

			}
		
			if(!Video.videoByUserId.containsValue(user.getId())) {
			
			System.out.println("You have not yet saved any videos"+"\n");
			break;
			}
		}
	}
}
