package com.cys.ssm.model;

public class Role {
	
	private Integer id;
	private String name;
	private Integer status;
	
	private String statusStr;
	private String urlIds;
	
	public String getUrlIds() {
		return urlIds;
	}
	public void setUrlIds(String urlIds) {
		this.urlIds = urlIds;
	}
	public String getStatusStr() {
		return statusStr;
	}
	public void setStatusStr(String statusStr) {
		this.statusStr = statusStr;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	

	
}
