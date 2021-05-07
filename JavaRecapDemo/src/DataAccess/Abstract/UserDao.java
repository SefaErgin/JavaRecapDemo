package DataAccess.Abstract;

import java.util.List;

import Entities.Concrete.User;

public interface UserDao {
	
	void add(User user);
	void update(User user);
	void delete(User user);
	User getById(int id);
	User getByEmail(String email);
	List<User> getAll();

}
