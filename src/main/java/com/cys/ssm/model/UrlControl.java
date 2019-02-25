package com.cys.ssm.model;

import java.util.List;

public class UrlControl {
	
	private Integer id;
	private String menu;
	private String name;
	private String url;
	private Integer status;
	private Integer orderBy;
	
	private String menuStr;
	private String statusStr;
	private List<String> ids;
	private boolean chooseFlag;
	
	public boolean isChooseFlag() {
		return chooseFlag;
	}
	public void setChooseFlag(boolean chooseFlag) {
		this.chooseFlag = chooseFlag;
	}
	public List<String> getIds() {
		return ids;
	}
	public void setIds(List<String> ids) {
		this.ids = ids;
	}
	public String getStatusStr() {
		return statusStr;
	}
	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}
	public String getMenuStr() {
		return menuStr;
	}
	public void setMenuStr(String menuStr) {
		this.menuStr = menuStr;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMenu() {
		return menu;
	}
	public void setMenu(String menu) {
		this.menu = menu;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(Integer orderBy) {
		this.orderBy = orderBy;
	}

	
}
