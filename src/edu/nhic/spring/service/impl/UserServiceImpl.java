package edu.nhic.spring.service.impl;

import edu.nhic.spring.bean.User;
import edu.nhic.spring.dao.UserDao;
import edu.nhic.spring.dao.UserHibernateDaoImpl;
import edu.nhic.spring.dao.UserMyBatisDaoImpl;
import edu.nhic.spring.service.UserService;

/**
 * @Author 陈庆履
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018年8月1日上午12:17:20
 * 
 *       User业务层接口实现类
 */
public class UserServiceImpl implements UserService {

	/** 强耦合 */
	// UserDao userDao = new UserMyBatisDaoImpl();

	private UserDao userDao;

	public UserServiceImpl() {
		/** 强耦合 */
		// userDao = new UserHibernateDaoImpl();
		// userDao = new UserMyBatisDaoImpl();
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void registerUser(User user) {

		System.out.println("UserServiceImpl业务层的registerUser(User u)方法被调用");
		// 调用dao方法完成持久化操作
		userDao.save(user);
	}

}
