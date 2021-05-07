package Business.Concrete;

import java.util.List;

import Business.Abstract.AuthService;
import Business.Abstract.UserService;
import Entities.Concrete.User;

public class AuthManager implements AuthService {
	
	UserService userService;

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(userService.add(user)) {
			userService.add(user);
			System.out.println(user.getFirstName() + " " +user.getLastName() + " Kay�tl�");	
			System.out.println("Hesab�n�z� do�rulamak i�in google.com adresine gidin.");
		}
		
	}

	@Override
	public void login(User user) {
		List<User> users = userService.getAll();
		for (User person : users) {
			if (person.getEmail().equals(user.getEmail()) && person.getPassword().equals(user.getPassword())) {
				System.out.println("Ba�ar�yla giri� yap�ld�.");
				break;
			}
		}
		System.out.println("Giri� yap�lamad�. E-postan�z� ve �ifrenizi kontrol edin.");
	}

}
