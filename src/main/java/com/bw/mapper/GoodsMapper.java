package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.entity.Goods;

public interface GoodsMapper {
	List<Goods> queryGoods(Map<String, Object>map);
}
