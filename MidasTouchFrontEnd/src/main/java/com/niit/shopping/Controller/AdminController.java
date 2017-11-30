package com.niit.shopping.Controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//@RequestMapping("/admin")
public class AdminController {
	
	@RequestMapping("/admin")
	public String adminPage()
	{
		return "UserIndex";
	}
	@GetMapping(value="/logout")
	public String logout(HttpServletRequest req,HttpServletResponse resp){
		
		Authentication auth = SecurityContextHolder.getContext().getAuthentication();
		if (auth != null){    
	        new SecurityContextLogoutHandler().logout(req, resp, auth);
	    }
	    return "redirect:/Login";
		
}
}
