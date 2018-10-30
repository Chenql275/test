package edu.nhic.spring.test;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import edu.nhic.spring.action.UserAction;

/**
 * @Author ������
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018��8��1������12:17:56
 * 
 * ������
 * �������ע��
 */
public class text {

	public static void main(String[] args) {

		/**ApplicationContext 
		 * ��BeanFactory�ӿڵ����� ���ܸ�ǿ�� 
		 * ��Ĭ�ϳ�ʼ������singleton bean 
		 * */
		ApplicationContext applicationContext =
				new ClassPathXmlApplicationContext("/applicationContext.xml");
		
		
		UserAction action = (UserAction) applicationContext.getBean("action");
	
		action.register();
	}

}
