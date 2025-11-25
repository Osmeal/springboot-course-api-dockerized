package io.javabrains.springbootstarter.users;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/users")
public class UsersController {

	@Autowired
	private UsersService usersService;

	@GetMapping
	public List<Users> getAllUsers() {
		return usersService.getAllUsers();
	}

	@GetMapping("/{id}")
	public Optional<Users> getUser(@PathVariable long id) {
		return usersService.getUser(id);
	}

	@PostMapping
	public void addUser(@RequestBody Users user) {
		usersService.addUser(user);
	}
	
	@DeleteMapping("/{id}")
	public void deleteUser(@PathVariable long id) {
		usersService.deleteUser(id);
	}
	
	@PutMapping("/{id}")
	public void updateUser(@RequestBody Users user, @PathVariable long id) {
		usersService.updateUser(id, user);
	}
}
