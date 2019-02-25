package com.cys.ssm.model;

import java.util.List;

public class RoleUrlControl {
	
	private Integer roleId;
	private String urlControls;
	
	private List<String> roleIds;

	
	public List<String> getRoleIds() {
		return roleIds;
	}
	public void setRoleIds(List<String> roleIds) {
		this.roleIds = roleIds;
	}
	public Integer getRoleId() {
		return roleId;
	}
	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}
	public String getUrlControls() {
		return urlControls;
	}
	public void setUrlControls(String urlControls) {
		this.urlControls = urlControls;
	}
	

	
}
