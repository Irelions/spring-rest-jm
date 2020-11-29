package com.example.springrestjm.controller;


import com.example.springrestjm.model.Role;
import com.example.springrestjm.model.User;
import com.example.springrestjm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;


@Controller
public class UserController {

	@Autowired
	private UserService userService;

	//Success +
	@GetMapping("admin")
	public String showAdmin(ModelMap model, @AuthenticationPrincipal org.springframework.security.core.userdetails.User user_authentication) {
		List<User> allUsers = userService.listUsers();
		User newUser = new User();
		User user = userService.getUserByName(user_authentication.getUsername());
		List<Role> roles = userService.allRoles();
		Set<Role> rolesString = userService.allRolesString();
		model.addAttribute("allRoles", roles);
		model.addAttribute("allUsers", allUsers);
		model.addAttribute("user_authentication", user);
		model.addAttribute("newUser", newUser);
		model.addAttribute("allRolesString", rolesString);
		return "admin";
	}

	//Success +
	@GetMapping("user")
	public String showUser(ModelMap model, @AuthenticationPrincipal org.springframework.security.core.userdetails.User user_authentication){
		User findUserByUsername = userService.getUserByName(user_authentication.getUsername());
		User user = userService.getUserByName(user_authentication.getUsername());
		List<Role> roles = userService.allRoles();
		model.addAttribute("allRoles", roles);
		model.addAttribute("findUserByUsername", findUserByUsername);
		model.addAttribute("user_authentication", user);
		return "user";
	}

	//Success +
	@PostMapping("/add")
	public String create(@ModelAttribute("user") User user, @RequestParam ("roles") String[] roles) {
		for(String role : roles) {
			if(role.toLowerCase().contains("admin")){
				user.setRoles(Set.of(new Role(1L, role)));
			}
			if(role.toLowerCase().contains("user")){
				user.setRoles(Set.of(new Role(2L, role)));
			}
		}
		userService.add(user);
		return "redirect:/admin/";
	}

	//Success +
    @GetMapping("login")
    public String loginPage() {
        return "login";
    }

	//Success +
	@PostMapping("admin/delete/{id}")
	public String delete(@PathVariable("id") int id) {
		userService.delete(id);
		return "redirect:/admin/";
	}

	//Success +
	@PostMapping("admin/edit/{id}")
	public String update(@PathVariable("id") int id, Model model) {
		User user = userService.showUser(id);
		model.addAttribute("userUpdate", user);
		return "redirect:/admin/";
	}
}