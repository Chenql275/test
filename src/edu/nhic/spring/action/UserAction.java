package edu.nhic.spring.action;

import edu.nhic.spring.bean.User;
import edu.nhic.spring.service.UserService;
import edu.nhic.spring.service.impl.UserServiceImpl;

/**
 * @Author 陈庆履
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018年8月1日上午12:15:58
 * 
 */
public class UserAction {

	/** 强耦合(硬编码，后期改动的话麻烦) */
	// private UserService userService = new UserServiceImpl();

	/** 用户服务层 */
	private UserService userService;
	/** 用户信息 */
	private User u;

	public UserAction() {
		/** 强耦合 */
		// userService = new UserServiceImpl();
	}

	/** get/set方法 */
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

		System.out.println("UserAction的register()方法被调用");

		System.out.println(u);
		userService.registerUser(u);
		return "success";
	}

}
