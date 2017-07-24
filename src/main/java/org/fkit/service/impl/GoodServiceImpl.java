package org.fkit.service.impl;

import java.util.List;

import org.fkit.domain.Good;
import org.fkit.mapper.GoodMapper;
import org.fkit.service.GoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Good服务层接口实现类
 * @Service("goodService")用于将当前类注释为一个Spring的bean，名为goodService
 * */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
@Service("goodService")
public class GoodServiceImpl implements GoodService {
	
	/**
	 * 自动注入GoodMapper
	 * */
	@Autowired
	private GoodMapper goodMapper;

	/**
	 * GoodService  impl getAll method
	 * @see { GoodService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAll() {
		
		return goodMapper.findAll();
	}
	
	/**
	 * GoodService接口getAllfresh方法实现
	 * @see { GoodService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAllfresh() {
		
		return goodMapper.findAllfresh();
	}

	/**
	 * GoodService接口getAlldried方法实现
	 * @see { GoodService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAlldried() {
		
		return goodMapper.findAlldried();
	}

	/**
	 * GoodService接口getAllfood方法实现
	 * @see { GoodService }
	 * */
	@Transactional(readOnly=true)
	@Override
	public List<Good> getAllfood() {
		
		return goodMapper.findAllfood();
	}
	
	/**
	 * 查找商品详情
	 */
	@Override
	public Good getGoodDetail(Integer good_sn) {
		// TODO Auto-generated method stub
		return goodMapper.findGoodDetail(good_sn);
	}
}

