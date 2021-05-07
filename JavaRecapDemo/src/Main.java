import Business.Concrete.AuthManager;
import Business.Concrete.UserManager;
import Core.Concrete.UserAuthAdapter;
import DataAccess.Concrete.HibernateUserDao;
import Entities.Concrete.User;

public class Main {

	public static void main(String[] args) {
		
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao()));
        UserManager userManager = new UserManager(new HibernateUserDao());
		UserAuthAdapter googleAuth = new UserAuthAdapter();
		
		User sefa = new User(1, "Sefa", "Ergin", "sefa@sefa.com", "admin123");
		User engin = new User(2, "Engin", "Demiroð", "engin@demirog.com", "engin123");
		User enes = new User(3, "Enes", "Ergin", "enes@enes.com", "enes123");

		System.out.println(userManager.getByEmail(engin.getEmail()));
		
		authManager.register(sefa);
		authManager.register(engin);
		authManager.register(enes);
		authManager.login(sefa);
		authManager.login(engin);
		authManager.login(enes);
		
		googleAuth.login();

	}

}
