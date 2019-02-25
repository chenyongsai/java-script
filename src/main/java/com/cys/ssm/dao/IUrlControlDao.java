package com.cys.ssm.dao;

import java.util.List;
import java.util.Map;

import com.cys.ssm.model.UrlControl;
import com.cys.ssm.model.User;


public interface IUrlControlDao {

	public UrlControl queryById(Integer id);    
    
    public List<UrlControl> queryList(UrlControl urlControl);    
        
    public void insert(UrlControl urlControl);    
        
    public void insertByBatch(List<UrlControl> list);    
        
    public void deleteById(Integer id);    
        
    public void deleteByBatch(Map<String,Object> params);    
        
    public void updateById(UrlControl urlControl);
    
}
