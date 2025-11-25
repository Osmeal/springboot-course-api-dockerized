package io.javabrains.springbootstarter.users;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

	@Autowired
	private UsersRepository usersRepository;

	public List<Users> getAllUsers() {
		List<Users> users = new ArrayList<>();
		usersRepository.findAll().forEach(users::add);
		return users;
	}

	public Optional<Users> getUser(long id) {
		return usersRepository.findById(id);
	}

	public void addUser(Users user) {
		usersRepository.save(user);
	}

	public void updateUser( long id, Users user) {
		user.setId(id);
		usersRepository.save(user);
	}

	public void deleteUser(long id) {
		usersRepository.deleteById(id);
	}

}
