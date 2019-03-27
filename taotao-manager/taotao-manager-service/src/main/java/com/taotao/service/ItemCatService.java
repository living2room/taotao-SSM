package com.taotao.service;

import java.util.List;

import com.taotao.common.pojo.TreeNode;


public interface ItemCatService {
	/**
	 * 获得商品类型的列表
	 * @param parentId 该类是否为父类
	 * @return
	 */
	public List<TreeNode> getItemCatList(long parentId);
}
