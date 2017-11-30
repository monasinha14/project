package com.niit.shopping.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.Dao.CategoryDAO;
import com.niit.shopping.Model.Category;
import com.niit.shopping.Model.Product;

@Controller
public class categoryController {
	@Autowired
	private CategoryDAO categoryDAO;
	@GetMapping(value="/category")
	public String getAllproduct(ModelMap model){
		List<Category> list=categoryDAO.getlist_category();
	    model.addAttribute("categoryList", list);
	    System.out.println(list);
	    return "category";
	}
	@GetMapping(value="/delete_category/{catId}")
	public String deletecategory(@PathVariable int catId){
		Category category=categoryDAO.getcatbyId(catId);
		categoryDAO.delete_category(category);
		return "redirect:/category";
	
	}
	
	@GetMapping(value="/addCategory")
	public String addcategory(Model model){
		model.addAttribute("category", new Category());
		return "addCategory";
	}
		@PostMapping(value="/savecategory")
		public String savecategory(@ModelAttribute("category") Category category){
			categoryDAO.add_category(category);
			return "redirect:/category";
	}
	
		
	}
	

