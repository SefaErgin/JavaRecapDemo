package Core.Concrete;

import Core.Abstract.UserAuth;
import UserAuth.UserAuthManager;

public class UserAuthAdapter implements UserAuth {
	
	UserAuthManager authManager = new UserAuthManager();
	public void login() {
		authManager.loginWithGoogle();
	}
	

}
