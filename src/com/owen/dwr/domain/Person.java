package com.owen.dwr.domain;

/**
 *ʵ��Person
 * @author OwenWilliam 2015-5-8
 * @version 1.0
 */
public class Person
{
	// ˽��Field
	private String name;
	// �޲����Ĺ�����
	public Person()	{}
	// ��ʼ��ȫ����Ա�����Ĺ�����
	public Person(String name)
	{
		this.name = name;
	}

	// name��setter��getter����
	public void setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
}