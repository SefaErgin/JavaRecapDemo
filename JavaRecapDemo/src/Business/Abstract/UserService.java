package Business.Abstract;

import java.util.List;

import Entities.Concrete.User;

public interface UserService {
	
	boolean add(User user);
	boolean update(User user);
	boolean delete(User user); 
	User getById(int id);
	User getByEmail(String email);
	List<User> getAll();

}
