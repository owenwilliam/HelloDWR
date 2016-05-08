package com.owen.dwr.domain;

/**
 *实体Person
 * @author OwenWilliam 2015-5-8
 * @version 1.0
 */
public class Person
{
	// 私有Field
	private String name;
	// 无参数的构造器
	public Person()	{}
	// 初始化全部成员变量的构造器
	public Person(String name)
	{
		this.name = name;
	}

	// name的setter和getter方法
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}