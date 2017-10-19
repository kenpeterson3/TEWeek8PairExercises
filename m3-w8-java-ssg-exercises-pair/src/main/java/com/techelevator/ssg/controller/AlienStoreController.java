package com.techelevator.ssg.controller;


import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
import com.techelevator.ssg.model.store.ShoppingCart;


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
	public String processProductPurchase(@RequestParam int quantity,@PathVariable Long id, HttpSession session) {
		Product current = dao.getProductById(id);
		
		
		if(session.getAttribute( "shoppingCart") == null) {
			session.setAttribute("shoppingCart", new ShoppingCart());
		}
		ShoppingCart sc = (ShoppingCart) session.getAttribute("shoppingCart");
		
		sc.addProduct(id, quantity);
		
		return "redirect:/shoppingCart/view";
	}
	
	@RequestMapping(path="/view", method=RequestMethod.GET)
	public String showPurchaseProducts(HttpSession session, ModelMap modelHolder) {
		
		Map<Product, Integer> productList = new HashMap<>();
		ShoppingCart sc = (ShoppingCart) session.getAttribute("shoppingCart");
		BigDecimal cost=new BigDecimal("1");
		
		if(sc != null) {
			Map<Long, Integer> shoppingCartProducts = sc.getAllProducts();
			for(Long productId : shoppingCartProducts.keySet()) {
				
				BigDecimal qty=new BigDecimal(shoppingCartProducts.get(productId)+"");
				
				Product currentProduct = dao.getProductById(productId);
				cost = cost.add(currentProduct.getPrice().multiply(qty));
				
				
				productList.put(currentProduct, shoppingCartProducts.get(productId));
				
			}	
		}
		modelHolder.put("productList", productList);
		modelHolder.put("cost", cost);
		
		
		
		
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
