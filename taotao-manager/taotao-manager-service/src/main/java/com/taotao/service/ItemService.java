package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;
import com.taotao.pojo.TbItem;

public interface ItemService {
	EUDataGridResult getItemList(int page , int rows);
	TbItem getItemById(Long itemId);
}
