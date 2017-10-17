package com.springbootlearning.project.service;


import com.springbootlearning.project.model.UserModel;

import java.util.List;
import java.util.Map;

/**
 * 用户信息表
 * 
 * @author zhangJT
 * @email 17612295532@163.com
 * @date 2017-10-12 11:22:08
 */
public interface UserService {
	
	UserModel queryObject(Integer id);
	
	List<UserModel> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(UserModel user);
	
	void update(UserModel user);
	
	void delete(Integer id);
	
	void deleteBatch(Integer[] ids);
}
