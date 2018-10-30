package edu.nhic.spring.dao;

import edu.nhic.spring.bean.User;

/**
 * @Author 陈庆履
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018年8月1日上午12:14:46
 * 
 * User持久化类接口
 */
public interface UserDao {

	void save(User user);
}
