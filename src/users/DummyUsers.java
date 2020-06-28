package users;

import java.time.LocalDate;

public class DummyUsers {

	public static void main(String args) {
		// TODO Auto-generated method stub
		
		
		User user1 = new User("Luca", "del Quinto", "quint", "123abcd!", LocalDate.parse("2020-01-15"));
		User user2 = new User("Maribel", "Tiere", "laTer", "132abcd!", LocalDate.parse("2020-02-15"));
		User user3 = new User("Rodolfo", "Valentino", "vaLe", "213abcd!", LocalDate.parse("2020-03-18"));

		User.usersList.add(user1);
		User.usersList.add(user2);
		User.usersList.add(user3);
		
		User.usersPool.put("quint", "123abcd!");
		User.usersPool.put("laTer", "132abcd!");
		User.usersPool.put("vaLe", "213abcd!");	

	}

}
