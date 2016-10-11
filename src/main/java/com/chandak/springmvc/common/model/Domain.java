/**
 * 
 */
package com.chandak.springmvc.common.model;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * This annotation is used to provide information about the domain type of a
 * class
 * 
 * @author krishna
 *
 */
@Target(value = { ElementType.TYPE })
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Domain {

	/**
	 * The method to specify domain type. Defaults to Empty.
	 * 
	 * @return {@link DomainType.EMPTY}
	 */
	DomainType value() default DomainType.EMPTY;
}
