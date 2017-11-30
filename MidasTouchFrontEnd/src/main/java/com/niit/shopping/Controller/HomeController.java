package com.niit.shopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
	 @RequestMapping({"/","/home"})
	public String Model(ModelMap model) {
		 model.addAttribute("welcome", "spring mvc");
	        return "index";
	}

}
