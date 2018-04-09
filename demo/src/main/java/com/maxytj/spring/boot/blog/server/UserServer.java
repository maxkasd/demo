package com.maxytj.spring.boot.blog.server;

import java.util.List;

import com.maxytj.spring.boot.blog.entity.User;

public interface UserServer {

	/**
	 * 
	 * <p>Title: saveOrUpdateUser</p>  
	 * <p>c���������޸��û�</p>  
	 * @param user
	 * @return
	 */
	User saveOrUpdateUser(User user);
	
	/**
	 * 
	 * <p>Title: deleteUser</p>  
	 * <p>ɾ���û�: </p>  
	 * @param id
	 */
	void deleteUser (Integer id);
	
	/**
	 * 
	 * <p>Title: getUserById</p>  
	 * <p>����Id��ѯ�û�: </p>  
	 * @param id
	 * @return
	 */
	User getUserById(Integer id);
	
	/**
	 * 
	 * <p>Title: listUser</p>  
	 * <p>��ѯ�û��б�: </p>  
	 * @return
	 */
	List<User> listUser();
	
}
