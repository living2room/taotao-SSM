package com.taotao.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.mapper.TbItemMapper;
import com.taotao.pojo.TbItem;
import com.taotao.pojo.TbItemExample;
import com.taotao.service.ItemService;

@Service
public class ItemServiceImpl implements ItemService{
	
	@Autowired(required=false)
	@Qualifier("itemmapper")
	private TbItemMapper itemmapper;
	
	@Override
	public EUDataGridResult getItemList(int page, int rows) {
		TbItemExample example = new TbItemExample();
		
		PageHelper.startPage(page, rows);
		
		List<TbItem> Ilist = itemmapper.selectByExample(example);

		EUDataGridResult result = new EUDataGridResult();
		result.setRows(Ilist);
		PageInfo<TbItem> info = new PageInfo<TbItem>(Ilist);
		result.setTotal(info.getTotal());
		return result; 
	}

}
