package com.cys.ssm.dao;

import java.util.List;
import java.util.Map;

import com.cys.ssm.model.Role;


public interface IRoleDao {

	public Role queryById(Integer id);    
    
    public List<Role> queryList(Role role);    
        
    public void insert(Role role);    
        
    public void insertByBatch(List<Role> list);    
        
    public void deleteById(Integer id);    
        
    public void deleteByBatch(Map<String,Object> params);    
        
    public void updateById(Role role);
    
}
