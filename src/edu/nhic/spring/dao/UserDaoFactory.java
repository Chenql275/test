package edu.nhic.spring.dao;

/**
 * @Author 陈庆履
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018年8月1日上午12:24:12
 * 
 * 工厂模式，获取UserDao的实现类
 */
public class UserDaoFactory {

	public static UserDao getUserDaoFactory() {
		
		return new UserMyBatisDaoImpl();
		//return new UserHibernateDaoImpl();
	}
}
