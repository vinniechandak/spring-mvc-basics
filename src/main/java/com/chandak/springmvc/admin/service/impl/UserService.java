/**
 * 
 */
package com.chandak.springmvc.admin.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chandak.springmvc.admin.model.User;
import com.chandak.springmvc.admin.repository.UserRepository;
import com.chandak.springmvc.admin.service.IUserService;

/**
 * @author krishna
 *
 */
@Service
public class UserService implements IUserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public User findById(Long id) {
		return userRepository.findOne(id);
	}

}
