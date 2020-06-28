package users;

import java.util.HashMap;

public class NewUserCheck {
	
public String checkPassword (String password) { //check whether the arg password is valid
		
		int num=0;
		int letter=0;
		int specialc=0;
		
		for (char c:password.toCharArray()) {
			
			if (Character.isDigit(c)) {
				num++;
				
			}else if(Character.isAlphabetic(c)) {
				letter++;
			
			}else {specialc++;
			}	
		}
		
		if (num>=1 && letter>=4 &&specialc==1) {
			
			return password;
					
		}else {
			
			throw new IllegalArgumentException("The password must include one special character and at least one number and four letters");
		}
	}	 

public String checkNickname (String nickname) { //check whether nickname already exists in the user's pool

	if (nickname.toString().length()<3 || nickname.toString().contains(" ")) {
		
		throw new IllegalArgumentException("This nickname is not available");
	}
	
	if(!User.usersPool.containsKey(nickname)) {
		
		return nickname;
	
	}else {
		
		throw new IllegalArgumentException("This nickname is not available");
	}
}


}