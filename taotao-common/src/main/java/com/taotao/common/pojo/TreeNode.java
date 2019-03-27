package com.taotao.common.pojo;
/**
 * 树节点
 * @author livin
 *
 */
public class TreeNode {

	private long id;//当前节点的id
	private String text;//节点显示的名称
	private String state; //节点的状态，如果是closed就是一个文件夹形式;open就显示为叶子节点

	
	public TreeNode() {
	}
	public TreeNode(long id, String text, String state) {
		super();
		this.id = id;
		this.text = text;
		this.state = state;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	
}
