package com.maxytj.spring.boot.blog.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
* <p>Title: User</p>  
* <p>Description:用户实体 </p>  
* @author maxytj  
* @date 2018年4月3日
 */
@Data //注解在类上；提供类所有属性的 getting 和 setting 方法，此外还提供了equals、canEqual、hashCode、toString 方法
@NoArgsConstructor //注解在类上；为类提供一个无参的构造方法
@AllArgsConstructor //注解在类上；为类提供一个全参的构造方法
public class User {
	//Id
	private  Integer id;
	//名字
	private String name; 
	//邮箱
	private String email;
}
