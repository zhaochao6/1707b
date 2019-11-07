package com.bw.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bw.entity.Goods;
import com.bw.service.GoodsService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class GoodsController {
	@Resource
	private GoodsService goodsService;
	
	@RequestMapping("list")
	public String list(@RequestParam(defaultValue="1")Integer pageNum,Model model){
		
		Map<String, Object>map=new HashMap<String, Object>();
		PageHelper.startPage(pageNum, 4);
		List<Goods> list = goodsService.queryGoods(map);
		PageInfo<Goods> page=new PageInfo<Goods>(list);
		model.addAttribute("page", page);
		return "list";
	}
}
