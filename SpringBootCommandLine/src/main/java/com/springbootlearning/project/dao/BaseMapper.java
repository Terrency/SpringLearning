package com.springbootlearning.project.dao;


import java.util.List;
import java.util.Map;

/**
 * 基础Mapper(还需在XML文件里，有对应的SQL语句)
 * 
 * @author zhangJT
 * @date 2017年10月08日 上午8:20:36
 * @version 1.1
 */
public interface BaseMapper<T> {
	
	void save(T t);
	
	void save(Map<String, Object> map);
	
	void saveBatch(List<T> list);
	
	int update(T t);
	
	int update(Map<String, Object> map);
	
	int delete(Object id);
	
	int delete(Map<String, Object> map);
	
	int deleteBatch(Object[] id);

	T queryObject(Object id);
	
	List<T> queryList(Map<String, Object> map);
	
	List<T> queryList(Object id);
	
	int queryTotal(Map<String, Object> map);

	int queryTotal();
}
