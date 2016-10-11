/**
 * 
 */
package com.chandak.springmvc.common.utils;

import org.hibernate.cfg.ImprovedNamingStrategy;

/**
 * @author krishna
 *
 */
public class CustomNamingStrategy extends ImprovedNamingStrategy {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8562316317965174742L;

	@Override
	public String classToTableName(String className) {
		return className.concat("_INFO");
	}
}
