package edu.nhic.spring.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import edu.nhic.spring.action.UserAction;

/**
 * @Author 陈庆履
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018年8月1日上午12:17:56
 * 
 * 测试类
 * 解决依赖注入
 */
public class text {

	public static void main(String[] args) {

		/**ApplicationContext 
		 * 是BeanFactory接口的子类 功能更强大 
		 * 会默认初始化单例singleton bean 
		 * */
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		
		UserAction action = (UserAction) applicationContext.getBean("action");
	
		action.register();
	}

}
