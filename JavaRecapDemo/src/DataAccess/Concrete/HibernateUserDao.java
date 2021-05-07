package DataAccess.Concrete;

import java.util.ArrayList;
import java.util.List;

import DataAccess.Abstract.UserDao;
import Entities.Concrete.User;

public class HibernateUserDao implements UserDao{
	
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);
		System.out.println(user.getFirstName() + user.getLastName() + " eklendi");
		
	}

	@Override
	public void update(User user) {
		User userToUpdate = users.stream()
				.filter(u -> u.getId() == user.getId())
				.findFirst()
				.orElse(null);
		userToUpdate.setEmail(user.getEmail());
		userToUpdate.setFirstName(user.getFirstName());
		userToUpdate.setLastName(user.getLastName());
		userToUpdate.setPassword(user.getPassword());
		
	}

	@Override
	public void delete(User user) {
		users.remove(user);
		System.out.println(user.getFirstName() + user.getLastName() + " silindi");
		
	}

	@Override
	public User getById(int id) {
		for (User user : users) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public User getByEmail(String email) {
		for (User user : users) {
			if (user.getEmail() == email)
				return user;
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

}
