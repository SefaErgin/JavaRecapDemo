package Business.Abstract;

import Entities.Concrete.User;

public interface AuthService {
	
	void register(User user);
	void login(User user);

}
