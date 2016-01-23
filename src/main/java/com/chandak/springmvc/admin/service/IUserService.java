/**
 * 
 */
package com.chandak.springmvc.admin.service;

import com.chandak.springmvc.admin.model.User;

/**
 * @author krishna
 *
 */
public interface IUserService {

	User findById(Long id);
}
