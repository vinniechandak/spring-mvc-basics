/**
 * 
 */
package com.chandak.springmvc.common.model;

/**
 * @author krishna
 *
 */
public enum DomainType {

	EMPTY(""), ADMIN("ADMIN"), PURCHASE("PURCHASE"), SALES("SALES");

	private String domainType;

	private DomainType(String domainType) {
		this.domainType = domainType;
	}

	public String getDomainType() {
		return this.domainType;
	}
}
