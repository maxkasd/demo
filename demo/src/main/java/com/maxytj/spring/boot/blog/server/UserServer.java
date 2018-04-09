package com.maxytj.spring.boot.blog.server;

import java.util.List;

import com.maxytj.spring.boot.blog.entity.User;

public interface UserServer {

	/**
	 * 
	 * <p>Title: saveOrUpdateUser</p>  
	 * <p>c创建或者修改用户</p>  
	 * @param user
	 * @return
	 */
	User saveOrUpdateUser(User user);
	
	/**
	 * 
	 * <p>Title: deleteUser</p>  
	 * <p>删除用户: </p>  
	 * @param id
	 */
	void deleteUser (Integer id);
	
	/**
	 * 
	 * <p>Title: getUserById</p>  
	 * <p>根据Id查询用户: </p>  
	 * @param id
	 * @return
	 */
	User getUserById(Integer id);
	
	/**
	 * 
	 * <p>Title: listUser</p>  
	 * <p>查询用户列表: </p>  
	 * @return
	 */
	List<User> listUser();
	
}
