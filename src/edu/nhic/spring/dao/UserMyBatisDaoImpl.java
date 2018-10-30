package edu.nhic.spring.dao;

import edu.nhic.spring.bean.User;
import edu.nhic.spring.dao.UserDao;

/**
 * @Author 陈庆履
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018年8月1日上午12:15:17
 * 
 * User持久层接口实现类
 */
public class UserMyBatisDaoImpl implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("调用了UserMyBatisDaoImpl的save()方法");
		
	}

}
