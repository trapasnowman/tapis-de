package org.fkit.service;

import java.util.List;

import org.fkit.domain.Cart;

public interface CartService {
	List<Cart> getAll();
	Cart findCart(int good_sn);
	Cart saveCart(int good_sn);
	Cart addCart(int good_sn);
	Cart reduceCart(int good_sn);
	Cart increaseCart(int good_sn);
	Cart removeCart(int good_sn);
	void clearCart();
}
