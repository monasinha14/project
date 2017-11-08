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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.Dao.ProductDAO;
import com.niit.shopping.Model.Product;

@Controller
public class productController {

	@Autowired
	private ProductDAO productDAO;

	@GetMapping(value = "/Products")
	public String getAllproduct(ModelMap model) {
		List<Product> list = productDAO.getlist_product();
		model.addAttribute("productList", list);
		System.out.println(list);
		return "Products";

	}

	@GetMapping(value = "/delete_product/{prodId}")
	public String deleteProduct(@PathVariable int prodId) {
		Product product = productDAO.getproductby_Id(prodId);
		productDAO.delete_product(product);
		return "redirect:/Products";
	}

	@GetMapping(value = "/editProduct/{prodId}")
	public String editProduct(@PathVariable("prodId") int prodId,Model model) {
      Product product = productDAO.getproductby_Id(prodId);
      model.addAttribute("product",  product);
		return "editProduct";
	}
	
	@PostMapping(value="/updateProduct")
	public String updateData(@ModelAttribute("product") Product product)
	{
		productDAO.update_product(product);
		return "redirect:/Products";
	}
	@GetMapping(value="/addProduct")
	public String addproduct(Model model){
	
		model.addAttribute("product", new Product());
		return "addproduct";
	}
		@PostMapping(value="/saveProduct")
		public String saveProduct(@ModelAttribute("product") Product product)
		{
			productDAO.add_product(product);
			return "redirect:/Products";
		}

}
