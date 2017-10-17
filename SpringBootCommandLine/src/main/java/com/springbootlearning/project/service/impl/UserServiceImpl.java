package com.springbootlearning.project.service.impl;

import com.springbootlearning.project.dao.UserMapper;
import com.springbootlearning.project.model.UserModel;
import com.springbootlearning.project.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;


@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userDao;
	
	@Override
	public UserModel queryObject(Integer id){
		return userDao.queryObject(id);
	}
	
	@Override
	public List<UserModel> queryList(Map<String, Object> map){
		return userDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return userDao.queryTotal(map);
	}
	
	@Override
	public void save(UserModel user){
		userDao.save(user);
	}
	
	@Override
	public void update(UserModel user){
		userDao.update(user);
	}
	
	@Override
	public void delete(Integer id){
		userDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Integer[] ids){
		userDao.deleteBatch(ids);
	}
	
}
