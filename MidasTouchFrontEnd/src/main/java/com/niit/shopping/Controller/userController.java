package com.niit.shopping.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.niit.shopping.Dao.UserDAO;
import com.niit.shopping.Model.User;

@Controller
public class userController {
	@Autowired
	private UserDAO userDAO;
	
	@GetMapping(value="/signUp")
	private String save(Model model){
		model.addAttribute("user", new User());
		return "signup";
	}
	
	@GetMapping(value="/save")
	public String saveUser(@ModelAttribute("user")User user,Model model){
		user.setRole("ROLE_USER");
		userDAO.add_user(user);
		return "Login";
		
	}
	@GetMapping(value="/login")
	private String saveLogin(Model model){
		return "Login";
	}
	@PostMapping(value="/savelogin")
	private String savelogin(@ModelAttribute("user") User user,Model model){
		return"UserIndex";
		
	}
	
	}
