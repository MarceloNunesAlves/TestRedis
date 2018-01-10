package br.com.flexvision;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

@Controller("homeBean")
@Scope("session")
public class HomeBean implements Serializable {
	private static final long serialVersionUID = 1L;

	private List<Product> products = new ArrayList<Product>();

	public HomeBean() {
		products.add(new Product("Product A", BigDecimal.valueOf(1)));
		products.add(new Product("Product B", BigDecimal.valueOf(2)));
		products.add(new Product("Product C", BigDecimal.valueOf(3)));
		products.add(new Product("Product D", BigDecimal.valueOf(4)));
		products.add(new Product("Product E", BigDecimal.valueOf(5)));
	}

	public void addItem(){
		products.add(new Product("Product "+(products.size()+1), BigDecimal.valueOf((products.size()+1))));
	}

	public List<Product> getProducts() {
		return products;
	}
}