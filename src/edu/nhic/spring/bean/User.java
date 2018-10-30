package edu.nhic.spring.bean;

import java.util.Date;

/**
 * @Author ������
 * @QQ 812445657
 * @Email 812445657@qq.com
 * @Date 2018��8��1������12:11:56
 * 
 */
public class User {

	private Integer id;
	private String name;
	private String sex;
	private Date current;

	/** �޲ι����� */
	public User() {
		System.out.println("User�޲ι�����");
	}

	
	public User(Integer id, String name, String sex, Date current) {
		super();
		this.id = id;
		this.name = name;
		this.sex = sex;
		this.current = current;
	}



	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getCurrent() {
		return current;
	}

	public void setCurrent(Date current) {
		this.current = current;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", sex=" + sex + ", current=" + current + "]";
	}

}
