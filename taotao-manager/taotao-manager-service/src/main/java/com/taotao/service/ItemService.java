package com.taotao.service;

import com.taotao.common.pojo.EUDataGridResult;

public interface ItemService {
	EUDataGridResult getItemList(int page , int rows);
}
