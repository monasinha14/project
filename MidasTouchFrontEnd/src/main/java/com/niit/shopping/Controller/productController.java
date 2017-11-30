package com.niit.shopping.Controller;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.niit.shopping.Dao.CategoryDAO;
import com.niit.shopping.Dao.ProductDAO;
import com.niit.shopping.Dao.SupplierDAO;
import com.niit.shopping.Model.Product;

@Controller
public class productController {

	@Autowired
	private ProductDAO productDAO;
	@Autowired
	private SupplierDAO supplierDAO;
	@Autowired
	private CategoryDAO categoryDAO;

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
	public String editProduct(@PathVariable("prodId") int prodId, Model model) {
		Product product = productDAO.getproductby_Id(prodId);
		model.addAttribute("product", product);
		return "editProduct";
	}

	@PostMapping(value = "/updateProduct")
	public String updateData(@ModelAttribute("product") Product product) {
		productDAO.update_product(product);
		return "redirect:/Products";
	}

	@GetMapping(value = "/addProduct")
	public String addproduct(Model model) {

		model.addAttribute("product", new Product());
		return "addproduct";
	}

	@PostMapping(value = "/saveProduct")
	public String saveProduct(@ModelAttribute("product") Product product, HttpServletRequest hs, Model model) {

		product.setSupplier(supplierDAO.getsupbyId(1));
		product.setCategory(categoryDAO.getcatbyId(1));
		MultipartFile file = product.getProdimg();
		productDAO.add_product(product);
		model.addAttribute("status", "add");

		String rootDirectory = hs.getSession().getServletContext().getRealPath("/");
		Path path = Paths.get(rootDirectory + "/resources/images/product/" + product.getProdId() + ".JPEG");
		System.out.println(path);

		if (file != null && !file.isEmpty()) {
			try {
				file.transferTo(new File(path.toString()));
			} catch (Exception ex) {
				ex.printStackTrace();
				throw new RuntimeException("Product image saving failed", ex);
			}

		}
		return "redirect:/Products";
	}

}
