package com.taotao.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.taotao.common.pojo.TreeNode;
import com.taotao.mapper.TbItemCatMapper;
import com.taotao.pojo.TbItemCat;
import com.taotao.pojo.TbItemCatExample;
import com.taotao.pojo.TbItemCatExample.Criteria;
import com.taotao.service.ItemCatService;
@Service("ItemCatService")
public class ItemCatServiceImpl implements ItemCatService{

	@Autowired
	private TbItemCatMapper itemCatMapper;

	@Override
	public List<TreeNode> getItemCatList(long parentId) {
		TbItemCatExample example = new TbItemCatExample();
		Criteria criteria = example.createCriteria();
		criteria.andParentIdEqualTo(parentId);//查询条件SELECT * FROM tb_item_cat WHERE parent_id = #{parentId}
		
		List<TbItemCat> list = itemCatMapper.selectByExample(example);
		List<TreeNode> treeList = new ArrayList<TreeNode>(); //创建一个符合EasyUI格式的列表将查询后的列表转换放里面
		for (TbItemCat tbItemCat : list) {
			TreeNode node  = new TreeNode(tbItemCat.getId(),tbItemCat.getName(), tbItemCat.getIsParent()?"closed":"open");
			treeList.add(node);
		}
		return treeList;
	}

}
