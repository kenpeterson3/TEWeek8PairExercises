package com.techelevator.ssg.controller;


import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.techelevator.ssg.model.store.Product;
import com.techelevator.ssg.model.store.ProductDao;


@Controller
@RequestMapping("/shoppingCart")
public class AlienStoreController {
	
	@Autowired
	private ProductDao dao;
	
	@RequestMapping(path="/index", method=RequestMethod.GET)
	public String showShoppingCart(ModelMap mapHolder, HttpSession session) {
		
		List<Product> products = dao.getAllProducts();
		mapHolder.put("products", products);
		
		return "/shoppingCart/index";
	}
	
	@RequestMapping(path="/detail/{id}", method=RequestMethod.GET)
	public String showProduct(@PathVariable Long id, ModelMap mapHolder) {
		
		Product current = dao.getProductById(id);
		mapHolder.put("product", current);
		
		
		return "/shoppingCart/detail";
	}
	
	@RequestMapping(path="/detail/{id}", method=RequestMethod.POST)
	public String processProductPurchase(@RequestParam int quantity,@PathVariable Long id, ModelMap mapHolder, HttpSession session) {
		Product current = dao.getProductById(id);
		session.setAttribute("userProduct"+id, current);
		
		
		
		return "redirect: /shoppingCart/view";
	}
	
	@RequestMapping(path="/view", method=RequestMethod.GET)
	public String showPurchaseProducts(@RequestParam int quantity, HttpSession session) {
		
		
		session.getAttribute("userProduct");
		Product current = dao.getProductById(id);
		mapHolder.put("product", current);
		
		
		return "/shoppingCart/view";
	}
	
	

//	
//	@RequestMapping(path="/addressInput", method=RequestMethod.POST)
//	public String processAddressInput(@RequestParam String addressStreet, @RequestParam String addressApartment, @RequestParam String addressCity, @RequestParam String addressZip, @RequestParam String addressState, HttpSession session) {
//		
//		CheckingAccountApplication app = (CheckingAccountApplication) session.getAttribute("application");
//		app.setAddressApartment(addressApartment);
//		app.setAddressStreet(addressStreet);
//		app.setAddressCity(addressCity);
//		app.setAddressState(addressState);
//		app.setAddressZip(addressZip);
//		
//		session.setAttribute("application", app);
//		
//		return "redirect:/checkingApplication/summary"; // this is optional, doesnt help or hurt
//	}
//	
//	@RequestMapping(path="/summary", method=RequestMethod.GET)
//	public String displaySummary() {
//		return "checkingApplication/summary";
//	}
//	
//	@RequestMapping(path="/completeApplication", method=RequestMethod.POST)
//	public String processApplication(HttpSession session) {
//				
//		/* This is where we would do something useful with the application, 
//		 * such as save it to a database. */
//		session.removeAttribute("application");
//				
//		return "redirect:/checkingApplication/thankYou";
//	}
//	
//	@RequestMapping(path="/thankYou", method=RequestMethod.GET)
//	public String displayThankYou() {
//		return "checkingApplication/thankYou";
//	}
}
