package com.taotao.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.taotao.common.pojo.TreeNode;
import com.taotao.service.ItemCatService;

@Controller("ItemCatController")
@RequestMapping("item/cat")
public class ItemCatController {
	
	@Autowired
	private ItemCatService itemService;
	
	@RequestMapping("list")
	@ResponseBody
	private List<TreeNode> getItemCatList(@RequestParam(value="id",defaultValue="0")long parentid){
		List<TreeNode> catList = itemService.getItemCatList(parentid);
		return catList;
	}
	
}
