/**
 * 
 */
package com.chandak.springmvc.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chandak.springmvc.admin.model.User;

/**
 * @author krishna
 *
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
