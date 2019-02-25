package com.cys.ssm.dao;

import java.util.List;
import java.util.Map;

import com.cys.ssm.model.Role;
import com.cys.ssm.model.RoleUrlControl;


public interface IRoleUrlControlDao {

	public RoleUrlControl queryById(Integer id);    
    
    public List<RoleUrlControl> queryList(RoleUrlControl ruc);    
        
    public void insert(RoleUrlControl ruc);    
        
    public void insertByBatch(List<RoleUrlControl> list);    
        
    public void deleteById(Integer id);    
        
    public void deleteByBatch(Map<String,Object> params);    
        
    public void updateById(RoleUrlControl ruc);
    
}
