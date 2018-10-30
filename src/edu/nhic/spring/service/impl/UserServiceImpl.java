package edu.nhic.spring.service.impl;

import edu.nhic.spring.bean.User;
import edu.nhic.spring.dao.UserDao;
import edu.nhic.spring.dao.UserHibernateDaoImpl;
import edu.nhic.spring.dao.UserMyBatisDaoImpl;
import edu.nhic.spring.service.UserService;

/**
 * @Author ������
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018��8��1������12:17:20
 * 
 *       Userҵ���ӿ�ʵ����
 */
public class UserServiceImpl implements UserService {

	/** ǿ��� */
	// UserDao userDao = new UserMyBatisDaoImpl();

	private UserDao userDao;

	public UserServiceImpl() {
		/** ǿ��� */
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

		System.out.println("UserServiceImplҵ����registerUser(User u)����������");
		// ����dao������ɳ־û�����
		userDao.save(user);
	}

}
