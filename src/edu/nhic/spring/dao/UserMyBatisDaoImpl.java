package edu.nhic.spring.dao;

import edu.nhic.spring.bean.User;
import edu.nhic.spring.dao.UserDao;

/**
 * @Author ������
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018��8��1������12:15:17
 * 
 * User�־ò�ӿ�ʵ����
 */
public class UserMyBatisDaoImpl implements UserDao{

	@Override
	public void save(User user) {
		System.out.println("������UserMyBatisDaoImpl��save()����");
		
	}

}
