package com.maxytj.spring.boot.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* <p>Title: User</p>  
* <p>Description:�û�ʵ�� </p>  
* @author maxytj  
* @date 2018��4��3��
 */
@Data //ע�������ϣ��ṩ���������Ե� getting �� setting ���������⻹�ṩ��equals��canEqual��hashCode��toString ����
@NoArgsConstructor //ע�������ϣ�Ϊ���ṩһ���޲εĹ��췽��
@AllArgsConstructor //ע�������ϣ�Ϊ���ṩһ��ȫ�εĹ��췽��
public class User {
	//Id
	private  Integer id;
	//����
	private String name; 
	//����
	private String email;
}
