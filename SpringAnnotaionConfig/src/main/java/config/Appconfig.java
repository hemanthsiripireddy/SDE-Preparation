package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import entity.ShoppingCart;
@Configuration
public class Appconfig {
	@Bean
	public ShoppingCart shoppingCart() {
		return new ShoppingCart();
	}

}
