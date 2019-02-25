package com.cys.ssm.dao;

import java.util.List;
import java.util.Map;

import com.cys.ssm.model.UserLog;


public interface IUserLogDao {

	public UserLog queryById(Integer id);    
    
    public List<UserLog> queryList(UserLog ul);    
        
    public void insert(UserLog ul);    
        
    public void insertByBatch(List<UserLog> list);    
        
    public void deleteById(Integer id);    
        
    public void deleteByBatch(Map<String,Object> params);    
        
}
