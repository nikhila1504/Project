package com.cts.resources;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.cts.beans.Cart;
import com.cts.service.CartService;
@RestController
@CrossOrigin
public class CartController {
	@Autowired
	CartService service;

	@RequestMapping("/products")
	List<Cart> getAllProducts() {
		return service.getAllProducts();
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/products")
	void addProduct(@RequestBody Cart cart) {
		service.addProducts(cart);
	}
	@RequestMapping(method = RequestMethod.DELETE, value="/products/{id}")
	void deleteProduct(@PathVariable int id) {
		service.deleteProduct(id);
	}
	@RequestMapping("/products/cart/{id}")
	Optional<Cart> getProductDetailsById(@PathVariable int id) {
		return service.getProductDetailsById(id);
	}
}