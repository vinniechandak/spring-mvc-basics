/**
 * 
 */
package com.chandak.springmvc.admin.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.chandak.springmvc.admin.model.User;
import com.chandak.springmvc.admin.service.IUserService;

/**
 * @author krishna
 *
 */
@Controller
@RequestMapping("/admin/user")
public class UserController {

	@Autowired
	private IUserService userService;

	@RequestMapping("getUserById")
	public User getUserById(@RequestParam(required = true, value = "id") Long id) {
		return userService.findById(id);
	}
}
