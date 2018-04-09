package com.maxytj.spring.boot.blog.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.web.ServerProperties.Undertow;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.maxytj.spring.boot.blog.entity.User;
import com.maxytj.spring.boot.blog.server.UserServer;

@RestController
@RequestMapping("/users")
public class UserController {

	@Autowired
	private UserServer uServer; //用户server
	
	/**
	 * <p>Title: list</p>  
	 * <p>用户列表: </p>  
	 * @param model
	 * @return
	 */
	@GetMapping
	public ModelAndView list(Model model) {
		model.addAttribute("userList", uServer.listUser());
		model.addAttribute("title", "用户管理");
		return new ModelAndView("users/list","userModel",model);
	}
	
	/**
	 * <p>Title: view</p>  
	 * <p>根据id查询用户: </p>  
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("{id}")
	public ModelAndView view(@PathVariable("id") Integer id,Model model) {
		User user = uServer.getUserById(id);
		model.addAttribute("user", user);
		model.addAttribute("title", "查看用户");
		return new ModelAndView("users/view","userModel",model);
	}
	
	/**
	 * <p>Title: view</p>  
	 * <p>获取创建用户界面</p>  
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("{form}")
	public ModelAndView createForm(Model model) {
		model.addAttribute("user", new User());
		model.addAttribute("title", "创建用户");
		return new ModelAndView("users/form","userModel",model);
	}	
	
	/**
	 * <p>Title: saveOrUpdateUser</p>  
	 * <p>保存用户数据: </p>  
	 * @param user
	 * @param model
	 * @return
	 */
	@PostMapping
	public ModelAndView saveOrUpdateUser(User user,Model model) {
		user =uServer.saveOrUpdateUser(user);
		return new ModelAndView("redirect:/users");//重定向到list页面
	}
	
	/**
	 * <p>Title: delete</p>  
	 * <p>删除用户: </p>  
	 * @param id
	 * @return
	 */
	@GetMapping("/delete/{id}")
	public ModelAndView delete(@PathVariable("id") Integer id) {
		uServer.deleteUser(id);
		return new ModelAndView("redirect:/users");//重定向到list页面
	}
	
	/**
	 * 
	 * <p>Title: modify</p>  
	 * <p>修改用户: </p>  
	 * @param id
	 * @param model
	 * @return
	 */
	@GetMapping("/modify/{id}")
	public ModelAndView modify(@PathVariable("id") Integer id,Model model) {
		User user =uServer.getUserById(id);
		model.addAttribute("user", user);
		model.addAttribute("title", "修改用户");
		return new ModelAndView("redirect:/users");//重定向到list页面
	}
	
}
