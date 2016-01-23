/**
 * 
 */
package com.chandak.springmvc.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.chandak.springmvc.admin.model.User;

/**
 * @author krishna
 *
 */
public interface UserRepository extends JpaRepository<User, Long> {

}
