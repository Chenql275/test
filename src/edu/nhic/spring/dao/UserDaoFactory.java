package edu.nhic.spring.dao;

/**
 * @Author ������
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018��8��1������12:24:12
 * 
 * ����ģʽ����ȡUserDao��ʵ����
 */
public class UserDaoFactory {

	public static UserDao getUserDaoFactory() {
		
		return new UserMyBatisDaoImpl();
		//return new UserHibernateDaoImpl();
	}
}
