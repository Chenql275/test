package edu.nhic.spring.service;

import edu.nhic.spring.bean.User;

/**
 * @Author 陈庆履
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018年8月1日上午12:16:34
 * 
 * UserService业务层接口
 */
public interface UserService {

	/**
	 * 注册用户
	 * @param user
	 */
	void registerUser(User user);
}
