package com.cys.ssm.model;

public class PageSource {
	
	/**
     * 页码，从1开始
     */
    private int pageNum = 1;
    /**
     * 页面大小
     */
    private int pageSize = 3;
    
	public int getPageNum() {
		return pageNum;
	}
	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	
    
    
}
