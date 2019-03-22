package com.taotao.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.service.ItemService;

@Controller("ItemController")
public class ItemController {
	@Resource
	private ItemService itemService;

	@RequestMapping("/item/list")
	@ResponseBody
	public EUDataGridResult getItemList(Integer page, Integer rows){
		EUDataGridResult result = itemService.getItemList(page, rows);
		return result;
	}
	
}
