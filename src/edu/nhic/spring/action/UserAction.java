package edu.nhic.spring.action;

import edu.nhic.spring.bean.User;
import edu.nhic.spring.service.UserService;
import edu.nhic.spring.service.impl.UserServiceImpl;

/**
 * @Author ������
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018��8��1������12:15:58
 * 
 */
public class UserAction {

	/** ǿ���(Ӳ���룬���ڸĶ��Ļ��鷳) */
	// private UserService userService = new UserServiceImpl();

	/** �û������ */
	private UserService userService;
	/** �û���Ϣ */
	private User u;

	public UserAction() {
		/** ǿ��� */
		// userService = new UserServiceImpl();
	}

	/** get/set���� */
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public User getU() {
		return u;
	}

	public void setU(User u) {
		this.u = u;
	}

	public String register() {

		System.out.println("UserAction��register()����������");

		System.out.println(u);
		userService.registerUser(u);
		return "success";
	}

}
