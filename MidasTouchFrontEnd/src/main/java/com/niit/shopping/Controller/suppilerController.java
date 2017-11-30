package com.niit.shopping.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.niit.shopping.Dao.SupplierDAO;
import com.niit.shopping.Model.Supplier;

@Controller
public class suppilerController {
	private Supplier suppiler;
	private SupplierDAO suppilerDAO;
	
	@GetMapping(value="/userindex")
	public String userindx(Model model){
		return "UserIndex";
	}
}
