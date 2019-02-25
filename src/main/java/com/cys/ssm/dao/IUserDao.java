package com.cys.ssm.dao;

import java.util.List;
import java.util.Map;

import com.cys.ssm.model.User;


public interface IUserDao {

	public User queryById(Integer id);    
    
    public List<User> queryList(User user);    
        
    public void insert(User user);    
        
    public void insertByBatch(List<User> list);    
        
    public void deleteById(Integer id);    
        
    public void deleteByBatch(Map<String,Object> params);    
        
    public void updateById(User user);
    
}
