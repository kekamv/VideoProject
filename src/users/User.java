package users;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class User {
	
	public static User getUserByNick(String nickN) {
		
		for(User user: usersList) {
			
			if(user.getNickName().contentEquals(nickN)) {
				
				return user;
			}
		}	return null;
	}
	

	
	public void getUser() {
		
		System.out.println("User name: "+"\t"+name+
				"\n"+"User surname: "+"\t"+surname+
				"\n"+"User nickname: "+"\t"+nickName+
				"\n"+"User Id: "+"\t"+id+
				"\n"+"User sign in date: "+"\t"+signInDate);
	}
	
	public String getNickName() {
		
		return nickName;
	}


	public int getId() {
		return id;
	}


	public static HashMap <String, String> usersPool= new HashMap<>(); //this variable will collect nickname and id of the created users
	
	public static List <User> usersList = new ArrayList<>();
	
	public static String userString= "user"+ User.IdUN;
	
	public static User addUser() {
		
		String name = new UserArgEntries().enterName();
		String surname = new UserArgEntries().enterSurname();
		String nickName = new UserArgEntries().enterNickname(); //should be unique within the class
		String password = new UserArgEntries().enterPassword();
		
		User userString = new User(name, surname, nickName, password);
		
		usersPool.put(nickName, password);
		
		usersList.add(userString);
		
		return userString;
	}
	
public User(String name, String surname, String nickName, String password, LocalDate signInDate) {
		
		id= 1+ Id;
		this.name = name;
		this.surname = surname;
		this.nickName = nickName;
		this.password= password;
		this.signInDate = signInDate;
		
		Id++;
		IdUN++;
	}	
	
	
	public User(String name,String surname,String nickName, String password) {
		id = 1 + Id;
		this.name = name;
		this.surname = surname;
		this.nickName = nickName; //should be unique within the class
		this.password = password;
		signInDate = LocalDate.now() ;
		
		Id++;
		IdUN++;
	}
	
	private static int Id=0;
	public static int IdUN=Id +1;
	
	private int id;
	private String name;
	private String surname;
	private String nickName;
	private String password;
	private LocalDate signInDate;
	
}
