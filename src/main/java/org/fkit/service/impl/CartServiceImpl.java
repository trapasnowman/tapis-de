package org.fkit.service.impl;

import java.util.List;


import javax.management.RuntimeErrorException;

import org.fkit.mapper.CartMapper;
import org.fkit.domain.Cart;
import org.fkit.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.DEFAULT)
@Service("cartService")
public class CartServiceImpl implements CartService{
	@Autowired
	private CartMapper CartMapper;

	@Override
	public List<Cart> getAll() {
		// TODO Auto-generated method stub
		return CartMapper.findAll();
	}
	
	@Override
	public Cart findCart(int good_id) {
		// TODO Auto-generated method stub
		return CartMapper.findWithId(good_id);
	}

	@Override
	public Cart saveCart(int good_id) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		cart.setGood_id(good_id);
		final int i = 1;
		cart.setCount(i);
		CartMapper.saveCart(cart);
		return cart;
	}
	@Override
	public Cart addCart(int good_id) {
		// TODO Auto-generated method stub
		Cart cart = CartMapper.findWithId(good_id);
		CartMapper.addCart(cart);
		return cart;
	}

	@Override
	public Cart reduceCart(int good_id) {
		// TODO Auto-generated method stub
		
				Cart Cart = CartMapper.findWithId(good_id);
				if (Cart.getCount() >= 1) {
					CartMapper.reduceCart(Cart);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}
				return Cart;
	}
	@Override
	public Cart increaseCart(int good_id) {
		// TODO Auto-generated method stub
		
				Cart cart = CartMapper.findWithId(good_id);
				if (cart.getCount() >= 1) {
					CartMapper.increaseCart(cart);
				} else {
					Error e = null;
					throw new RuntimeErrorException(e);
				}
				return cart;
	}


	@Override
	public Cart removeCart(int good_id) {
		// TODO Auto-generated method stub
		Cart cart = CartMapper.findWithId(good_id);
		CartMapper.removeCart(cart);
		return cart;
	}

}

