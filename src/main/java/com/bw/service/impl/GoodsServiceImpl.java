package com.bw.service.impl;

import java.util.List;

import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bw.entity.Goods;
import com.bw.mapper.GoodsMapper;
import com.bw.service.GoodsService;
@Service
@Transactional
public class GoodsServiceImpl implements GoodsService {
	@Resource
	private GoodsMapper goodsMapper;
	public List<Goods> queryGoods(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return goodsMapper.queryGoods(map);
	}

}
