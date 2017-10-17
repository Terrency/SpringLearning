package com.springbootlearning.project.dao;

import com.springbootlearning.project.model.UserModel;
import org.springframework.stereotype.Repository;

/**
 * 用户信息表
 * 
 * @author zhangJT
 * @email 17612295532@163.com
 * @date 2017-10-12 11:22:08
 */
@Repository
public interface UserMapper extends BaseMapper<UserModel> {
	
}
